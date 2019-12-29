package org.wit.archaeologicalfieldwork.views.hillfort

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.DatePicker
import androidx.viewpager.widget.ViewPager
import com.google.android.gms.maps.GoogleMap
import org.wit.archaeologicalfieldwork.adapter.ImageAdapter
import kotlinx.android.synthetic.main.activity_hillfort.*
import org.jetbrains.anko.*
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.views.Base.BaseView
import java.util.*

class HillfortView : BaseView(), AnkoLogger {


    lateinit var presenter: HillfortPresenter
    var hillfort = HillfortModel()
    lateinit var map: GoogleMap


  //  var location = LocationModel(52.245696, -7.139102, 15f)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hillfort)
        toolbarAdd.title = title
        init(toolbarAdd)

        presenter = initPresenter(HillfortPresenter(this)) as HillfortPresenter

        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync {
            map = it
            presenter.doConfigureMap(map)
        }

        btnAdd.setOnClickListener() {
            if (hillfortName.text.toString().isEmpty()) {
                toast(R.string.enter_hillfort_name)
            } else {
                presenter.doAddOrSave(hillfortName.text.toString(), description.text.toString(), checkbox.isChecked, dateText.text.toString(), notes.text.toString())
            }
        }

        chooseImage.setOnClickListener {presenter.doSelectImage()}

        checkbox.setOnClickListener {
            presenter.doCheckBox(checkbox.isChecked)
            if (checkbox.isChecked()){
                btnDate.setText("Change visited date")
            } else {
                btnDate.setText("Change visit date")
            }
        }

        hillfortLocation.setOnClickListener { presenter.doSetLocation()}

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

        deleteHillfortBtn.setOnClickListener {presenter.doDelete()
            presenter.doCancel()
        }
    }

    override fun showHillfort(hillfort:HillfortModel) {
        hillfortName.setText(hillfort.name)
        description.setText(hillfort.description)
        checkbox.setChecked(hillfort.visited)
        dateText.setText(hillfort.date)
        lngText.setText("Longitude " +hillfort.lng.toString())
        latText.setText("Latitude " +  hillfort.lat.toString())
        notes.setText(hillfort.notes)
        btnAdd.setText(R.string.save_hillfort)
        chooseImage.setText((R.string.change_hillfort_image))
        deleteHillfortBtn.visibility = View.VISIBLE
        val images = findViewById<ViewPager>(R.id.hillfortImages)
        val adapter =
            ImageAdapter(this, hillfort.imageStore)
        images.adapter = adapter
        btnAdd.setText(R.string.save_hillfort)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_hillfort, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.item_cancel -> {
                presenter.doCancel()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null) {
            presenter.doActivityResult(requestCode, resultCode, data)
            }
        }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
        presenter.doResartLocationUpdates()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mapView.onSaveInstanceState(outState)
    }
}
