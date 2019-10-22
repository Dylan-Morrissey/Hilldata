package org.wit.archaeologicalfieldwork.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_hillfort.*
import org.jetbrains.anko.*
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.helpers.readImage
import org.wit.archaeologicalfieldwork.helpers.showImagePicker
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.helpers.readImageFromPath
import org.wit.archaeologicalfieldwork.models.LocationModel

class HillfortActivity : AppCompatActivity(), AnkoLogger {

    var hillfort = HillfortModel()
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

        if (intent.hasExtra("hillfort_edit")) {
            edit = true
            hillfort = intent.extras?.getParcelable<HillfortModel>("hillfort_edit")!!
            hillfortName.setText(hillfort.name)
            description.setText(hillfort.description)
            checkbox.setChecked(hillfort.visited)
            hillfortImage.setImageBitmap(readImageFromPath(this, hillfort.image))
            btnAdd.setText(R.string.save_hillfort)
            chooseImage.setText((R.string.change_hillfort_image))
        }

        btnAdd.setOnClickListener() {
            hillfort.name = hillfortName.text.toString()
            hillfort.description = description.text.toString()
            hillfort.visited = checkbox.isChecked()
            if (hillfort.name.isEmpty()) {
                toast(R.string.enter_hillfort_name)
            } else {
                if (edit) {
                    app.hillforts.update(hillfort.copy())
                } else {
                    app.hillforts.create(hillfort.copy())
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
            hillfort.visited = true;
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
    }
}
