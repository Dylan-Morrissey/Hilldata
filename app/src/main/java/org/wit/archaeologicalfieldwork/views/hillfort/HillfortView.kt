package org.wit.archaeologicalfieldwork.views.hillfort

import android.app.DatePickerDialog
import android.content.Intent
import android.location.Location
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.DatePicker
import androidx.viewpager.widget.ViewPager
import com.bumptech.glide.Glide
import com.google.android.gms.maps.GoogleMap
import org.wit.archaeologicalfieldwork.adapter.ImageAdapter
import kotlinx.android.synthetic.main.activity_hillfort.*
import org.jetbrains.anko.*
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.helpers.readImageFromPath
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.models.LocationModel
import org.wit.archaeologicalfieldwork.views.Base.BaseView
import java.util.*

class HillfortView : BaseView(), AnkoLogger {

    lateinit var presenter: HillfortPresenter
    var hillfort = HillfortModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hillfort)
        toolbarAdd.title = title
        init(toolbarAdd, true)

        presenter = initPresenter(HillfortPresenter(this)) as HillfortPresenter

        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync {
            presenter.doConfigureMap(it)
            it.setOnMapClickListener { presenter.doSelectImage() }
        }

        chooseImage.setOnClickListener {presenter.doSelectImage()}

        togglefavoite.setOnClickListener{
            presenter.doFavorite(togglefavoite.isChecked)

        }

        checkbox.setOnClickListener {
            presenter.doCheckBox(checkbox.isChecked)
            if (checkbox.isChecked()){
                btnDate.setText("Change visited date")
            } else {
                btnDate.setText("Change visit date")
            }
        }

        //hillfortLocation.setOnClickListener { presenter.doSetLocation()}
        mapView.getMapAsync {
            presenter.doConfigureMap(it)
            it.setOnMapClickListener { presenter.doSetLocation() }
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

        deleteHillfortBtn.setOnClickListener {presenter.doDelete()
            presenter.doCancel()
        }
    }

    override fun showHillfort(hillfort:HillfortModel) {
        hillfortName.setText(hillfort.name)
        description.setText(hillfort.description)
        checkbox.setChecked(hillfort.visited)
        togglefavoite.setChecked(hillfort.favorite)
        dateText.setText(hillfort.date)
        lngText.setText("Longitude " +hillfort.location.lng.toString())
        latText.setText("Latitude " +  hillfort.location.lat.toString())
        notes.setText(hillfort.notes)
        chooseImage.setText((R.string.change_hillfort_image))
        deleteHillfortBtn.visibility = View.VISIBLE
        hillfortImages.setImageBitmap(readImageFromPath(this, hillfort.image))
        Glide.with(this).load(hillfort.image).into(hillfortImages);
        hillfortRatingBar?.rating = hillfort.rating.toFloat()
        if (hillfort.image != null) {
            chooseImage.setText(R.string.change_hillfort_image)
        }
        this.showLocation(hillfort.location)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_hillfort, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun showLocation(location: LocationModel) {
        latText.setText("%.6f".format(location.lat))
        lngText.setText("%.6f".format(location.lng))
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.item_cancel -> {
                presenter.doCancel()
            }
            R.id.save_hillfort -> {
                if (hillfortName.text.toString().isEmpty()) {
                    toast(R.string.enter_hillfort_name)
                } else {
                    presenter.doAddOrSave(hillfortName.text.toString(), description.text.toString(), checkbox.isChecked, dateText.text.toString(), notes.text.toString(), hillfortRatingBar.rating.toInt(), togglefavoite.isChecked)
                }
            }
            R.id.share_hillfort -> {
                presenter.doShare()
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