package org.wit.archaeologicalfieldwork.views.hillfort

import android.annotation.SuppressLint
import android.content.Intent
import androidx.viewpager.widget.ViewPager
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import org.jetbrains.anko.intentFor
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.views.editlocation.MapView
import org.wit.archaeologicalfieldwork.adapter.ImageAdapter
import org.wit.archaeologicalfieldwork.helpers.showImagePicker
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.models.LocationModel
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.models.UserModel
import org.wit.archaeologicalfieldwork.helpers.checkLocationPermissions
import org.wit.archaeologicalfieldwork.helpers.isPermissionGranted
import org.wit.archaeologicalfieldwork.views.Base.*


class HillfortPresenter(view: BaseView): BasePresenter(view) {

        var user = UserModel()
        var map: GoogleMap? = null
        var locationService: FusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(view)
        var hillfort = HillfortModel()
        var location = LocationModel(52.245696, -7.139102, 15f)
        var edit = false;

        init {
            user = app.user
            if (view.intent.hasExtra("hillfort_edit")) {
                edit = true
                hillfort = view.intent.extras?.getParcelable<HillfortModel>("hillfort_edit")!!
                view.showHillfort(hillfort)
            } else {
                if (checkLocationPermissions(view)) {
                    doSetCurrentLocation()
                }
            }
        }
    @SuppressLint("MissingPermission")
    fun doSetCurrentLocation() {
        locationService.lastLocation.addOnSuccessListener {
            locationUpdate(it.latitude, it.longitude)
        }
    }

    fun doConfigureMap(m:GoogleMap){
        map = m
        locationUpdate(hillfort.lat, hillfort.lng)
    }

    fun locationUpdate(lat:Double, lng:Double){
        hillfort.lat = lat
        hillfort.lng = lng
        hillfort.zoom = 15f
        map?.clear()
        map?.uiSettings?.setZoomControlsEnabled(true)
        val options = MarkerOptions().title(hillfort.name).position(LatLng(hillfort.lat, hillfort.lng))
        map?.addMarker(options)
        map?.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(hillfort.lat, hillfort.lng), hillfort.zoom))
        view?.showHillfort(hillfort)
    }

    override fun doRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        if (isPermissionGranted(requestCode, grantResults)) {
            doSetCurrentLocation()
        } else {
            // permissions denied, so use the default location
            locationUpdate(location.lat, location.lng)
        }
    }

    fun doAddOrSave(name: String, description: String, visited: Boolean, date: String, notes: String) {
        hillfort.name = name
        hillfort.description = description
        hillfort.visited = visited
        hillfort.date = date
        hillfort.notes = notes

        if (edit) {
            app.users.updateHillfort(hillfort.copy(), user)
        } else {
            app.users.createHillfort(hillfort.copy(), user)
        }
        view?.finish()
    }

    fun doCancel() {
        view?.finish()
    }

    fun doDelete() {
        app.users.deleteHillfort(hillfort.copy(), user)
    }

    fun doSelectImage(){
        showImagePicker(view!!, IMAGE_REQUEST)
    }

    fun doCheckBox(checkBox: Boolean) {
        hillfort.visited = checkBox
    }

    fun doSetLocation() {
        if (edit == false) {
            view?.navigateTo(VIEW.LOCATION, LOCATION_REQUEST, "location", location)
        } else {
            view?.navigateTo(
                VIEW.LOCATION,
                LOCATION_REQUEST,
                "location",
                LocationModel(hillfort.lat, hillfort.lng, hillfort.zoom)
            )
        }
    }

    override fun doActivityResult(requestCode:Int, resultCode: Int, data: Intent) {
        when (requestCode) {
            IMAGE_REQUEST -> {
                    hillfort.image = data.data.toString()
                    hillfort.imageStore.add(hillfort.image)
                    val images = view?.findViewById<ViewPager>(R.id.hillfortImages)
                    val adapter = ImageAdapter(view!!, hillfort.imageStore)
                    images?.adapter = adapter
                }
            LOCATION_REQUEST -> {
                val location = data.extras?.getParcelable<LocationModel>("location")!!
                hillfort.lat = location.lat
                hillfort.lng = location.lng
                hillfort.zoom = location.zoom

            }
        }
    }
}
