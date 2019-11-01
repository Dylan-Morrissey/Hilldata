package org.wit.archaeologicalfieldwork.activities

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import android.widget.DatePicker
import kotlinx.android.synthetic.main.activity_hillfort.*
import org.jetbrains.anko.*
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.helpers.readImage
import org.wit.archaeologicalfieldwork.helpers.showImagePicker
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.helpers.readImageFromPath
import org.wit.archaeologicalfieldwork.models.LocationModel
import org.wit.archaeologicalfieldwork.models.UserModel
import java.util.*

class HillfortActivity : AppCompatActivity(), AnkoLogger {

    var hillfort = HillfortModel()
    var user = UserModel()
    lateinit var app: MainApp
    var edit = false
    var IMAGE_REQUEST = 1
    val LOCATION_REQUEST = 2
  //  var location = LocationModel(52.245696, -7.139102, 15f)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hillfort)
        toolbarAdd.title = title
        setSupportActionBar(toolbarAdd)

        app = application as MainApp
        user = app.user

        if (intent.hasExtra("hillfort_edit")) {
            edit = true
            hillfort = intent.extras?.getParcelable<HillfortModel>("hillfort_edit")!!
            hillfortName.setText(hillfort.name)
            description.setText(hillfort.description)
            checkbox.setChecked(hillfort.visited)
            dateText.setText(hillfort.date)
            lngText.setText("Longitude " +hillfort.lng.toString())
            latText.setText("Latitude " +  hillfort.lat.toString())
            notes.setText(hillfort.notes)
            hillfortImage.setImageBitmap(readImageFromPath(this, hillfort.image))
            btnAdd.setText(R.string.save_hillfort)
            chooseImage.setText((R.string.change_hillfort_image))
            deleteHillfortBtn.visibility = View.VISIBLE
        }

        if (checkbox.isChecked() == true){
            btnDate.setText("Change visited date")
        } else {
            btnDate.setText("Change visit date")
        }

        btnAdd.setOnClickListener() {
            hillfort.name = hillfortName.text.toString()
            hillfort.description = description.text.toString()
            hillfort.visited = checkbox.isChecked()
            hillfort.date = dateText.text.toString()
            hillfort.notes = notes.text.toString()
            if (hillfort.name.isEmpty()) {
                toast(R.string.enter_hillfort_name)
            } else {
                if (edit) {
                    app.users.updateHillfort(hillfort.copy(), user)
                } else {
                    app.users.createHillfort(hillfort.copy(), user)
                }
            }
            info("add Button Pressed:${hillfort}")
            setResult(AppCompatActivity.RESULT_OK)
            finish()
        }
        chooseImage.setOnClickListener {
            showImagePicker(this, IMAGE_REQUEST)
        }
        checkbox.setOnClickListener {
            if (checkbox.isChecked() == true){
                hillfort.visited = true;
                btnDate.setText("Change visited date")
            } else {
                hillfort.visited = false;
                btnDate.setText("Change visit date")
            }
        }

        hillfortLocation.setOnClickListener {
            val location = LocationModel(52.245696, -7.139102, 15f)
            if (hillfort.zoom !=0f){
                location.lat= hillfort.lat
                location.lng=hillfort.lng
                location.zoom=hillfort.zoom
            }
            startActivityForResult( intentFor<MapActivity>().putExtra("location",location),LOCATION_REQUEST)
        }

        btnDate.setOnClickListener {
          val calander = Calendar.getInstance()
          val year = calander.get(Calendar.YEAR)
          val month = calander.get(Calendar.MONTH)
          val day = calander.get(Calendar.DAY_OF_MONTH)
          val datePicker = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{view:DatePicker, mYear:Int, mMonth:Int, mDay:Int ->
              dateText.setText("" + mDay + "/" + mMonth + "/" + mYear)
          }, year, month, day)
            datePicker.show()
        }

        deleteHillfortBtn.setOnClickListener {
            app.users.deleteHillfort(hillfort.copy(), user)
            info("Delete Button Pressed")
            setResult(AppCompatActivity.RESULT_OK)
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_hillfort, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.item_cancel -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            IMAGE_REQUEST -> {
                if (data != null) {
                    hillfort.image = data.getData().toString()
                    hillfortImage.setImageBitmap(readImage(this, resultCode, data))
                    chooseImage.setText(R.string.change_hillfort_image)
                    }
            }
            LOCATION_REQUEST -> {
                if (data != null) {
                    val location=data.extras?.getParcelable<LocationModel>("location")!!
                    hillfort.lat = location.lat
                    hillfort.lng = location.lng
                    hillfort.zoom = location.zoom
                }
            }
        }
        lngText.setText("Longitude " + hillfort.lng.toString())
        latText.setText("Latitude " + hillfort.lat.toString())
    }
}
