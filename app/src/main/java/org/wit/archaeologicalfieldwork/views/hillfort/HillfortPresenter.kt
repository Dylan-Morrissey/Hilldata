package org.wit.archaeologicalfieldwork.views.hillfort

import android.annotation.SuppressLint
import android.content.Intent
import androidx.viewpager.widget.ViewPager
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
<<<<<<< HEAD
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
=======
>>>>>>> 377f6d9accf986e08b58ae4575005f9f6550becc
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.adapter.ImageAdapter
import org.wit.archaeologicalfieldwork.helpers.showImagePicker
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.helpers.checkLocationPermissions
import org.wit.archaeologicalfieldwork.helpers.createDefaultLocationRequest
import org.wit.archaeologicalfieldwork.helpers.isPermissionGranted
<<<<<<< HEAD
import org.wit.archaeologicalfieldwork.models.LocationModel
=======
import org.wit.archaeologicalfieldwork.models.Location
>>>>>>> 377f6d9accf986e08b58ae4575005f9f6550becc
import org.wit.archaeologicalfieldwork.views.Base.*


class HillfortPresenter(view: BaseView): BasePresenter(view) {

    var map: GoogleMap? = null
    var hillfort = HillfortModel()
    var defaultLocation = Location(52.245696, -7.139102, 15f)
    var edit = false;
    var locationService: FusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(view)
    val locationRequest = createDefaultLocationRequest()

    init {
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
<<<<<<< HEAD
            locationUpdate(LocationModel(it.latitude, it.longitude))
        }
    }

    @SuppressLint("MissingPermission")
    fun doResartLocationUpdates() {
        var locationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult?) {
                if (locationResult != null && locationResult.locations != null) {
                    val l = locationResult.locations.last()
                    locationUpdate(LocationModel(l.latitude, l.longitude))
                }
            }
        }
        if (!edit) {
            locationService.requestLocationUpdates(locationRequest, locationCallback, null)
        }
=======
            locationUpdate(Location(it.latitude, it.longitude))
        }
    }

    fun doConfigureMap(m:GoogleMap){
        map = m
        locationUpdate(hillfort.location)
    }

    fun locationUpdate(location: Location){
        hillfort.location = location
        hillfort.location.zoom = 15f
        map?.clear()
        val options = MarkerOptions().title(hillfort.name).position(LatLng(hillfort.location.lat, hillfort.location.lng))
        map?.addMarker(options)
        map?.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(hillfort.location.lat, hillfort.location.lng), hillfort.location.zoom))
        view?.showHillfort(hillfort)
>>>>>>> 377f6d9accf986e08b58ae4575005f9f6550becc
    }

    override fun doRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        if (isPermissionGranted(requestCode, grantResults)) {
            doSetCurrentLocation()
        } else {
            // permissions denied, so use the default location
            locationUpdate(defaultLocation)
        }
    }

    fun doConfigureMap(m:GoogleMap){
        map = m
        locationUpdate(hillfort.location)
    }

    fun locationUpdate(location: LocationModel){
        hillfort.location = location
        hillfort.location.zoom = 15f
        map?.clear()

        val options = MarkerOptions().title(hillfort.name).position(LatLng(hillfort.location.lat, hillfort.location.lng))
        map?.addMarker(options)
        map?.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(hillfort.location.lat, hillfort.location.lng), hillfort.location.zoom))
        view?.showHillfort(hillfort)
    }

    fun doAddOrSave(name: String, description: String, visited: Boolean, date: String, notes: String) {
        hillfort.name = name
        hillfort.description = description
        hillfort.visited = visited
        hillfort.date = date
        hillfort.notes = notes
        doAsync {
            if (edit) {
                app.hillforts.updateHillfort(hillfort)
            } else {
                app.hillforts.createHillfort(hillfort)
            }
            uiThread {
                view?.finish()
            }
        }
    }

    fun doCancel() {
        view?.finish()
    }

    fun doDelete() {
        doAsync {
            app.hillforts.deleteHillfort(hillfort)
            uiThread {
                view?.finish()
            }
        }
    }

    fun doSelectImage(){
        view?.let {
            showImagePicker(view!!, IMAGE_REQUEST)
        }
    }

    fun doCheckBox(checkBox: Boolean) {
        hillfort.visited = checkBox
    }

    fun doSetLocation() {
<<<<<<< HEAD
        view?.navigateTo(VIEW.LOCATION, LOCATION_REQUEST, "location", LocationModel(hillfort.location.lat, hillfort.location.lng, hillfort.location.zoom))
=======
        view?.navigateTo(VIEW.LOCATION, LOCATION_REQUEST, "location", Location(hillfort.location.lat, hillfort.location.lng, hillfort.location.zoom))
    }

    @SuppressLint("MissingPermission")
    fun doResartLocationUpdates() {
        var locationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult?) {
                if (locationResult != null && locationResult.locations != null) {
                    val l = locationResult.locations.last()
                    locationUpdate(Location(l.latitude, l.longitude))
                }
            }
        }
        if (!edit) {
            locationService.requestLocationUpdates(locationRequest, locationCallback, null)
        }
>>>>>>> 377f6d9accf986e08b58ae4575005f9f6550becc
    }

    override fun doActivityResult(requestCode:Int, resultCode: Int, data: Intent) {
        when (requestCode) {
            IMAGE_REQUEST -> {
                hillfort.image = data.data.toString()
                view?.showHillfort(hillfort)

                }
            LOCATION_REQUEST -> {
<<<<<<< HEAD
                val location = data.extras?.getParcelable<LocationModel>("location")!!
=======
                val location = data.extras?.getParcelable<Location>("location")!!
>>>>>>> 377f6d9accf986e08b58ae4575005f9f6550becc
                hillfort.location = location
                locationUpdate(location)

            }
        }
    }
}
