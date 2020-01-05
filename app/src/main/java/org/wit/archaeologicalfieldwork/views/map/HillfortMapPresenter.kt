package org.wit.archaeologicalfieldwork.views.map

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.content_hillfort_maps.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import org.wit.archaeologicalfieldwork.helpers.readImageFromPath
import org.wit.archaeologicalfieldwork.main.MainApp
<<<<<<< HEAD
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.views.Base.BasePresenter
import org.wit.archaeologicalfieldwork.views.Base.BaseView
import org.wit.archaeologicalfieldwork.views.Base.VIEW

class HillfortMapPresenter (view: BaseView): BasePresenter(view){
=======
import org.wit.archaeologicalfieldwork.views.Base.BasePresenter

class HillfortMapPresenter (view: HillfortMapView): BasePresenter(view){

    override var app: MainApp = view.application as MainApp
>>>>>>> 377f6d9accf986e08b58ae4575005f9f6550becc

    fun doPopulateMap(map: GoogleMap, hillforts: List<HillfortModel>) {
        map.uiSettings.setZoomControlsEnabled(true)
<<<<<<< HEAD
        hillforts.forEach {
            val loc = LatLng(it.location.lat, it.location.lng)
            val options = MarkerOptions().title(it.name).position(loc)
            map.addMarker(options).tag = it
=======
        app.user.hillforts.forEach {
            val loc = LatLng(it.location.lat, it.location.lng)
            val options = MarkerOptions().title(it.name).position(loc)
            map.addMarker(options).tag = it.id
>>>>>>> 377f6d9accf986e08b58ae4575005f9f6550becc
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(loc, it.location.zoom))
        }
    }

    fun doMarkerSelected(marker: Marker) {
        val tag = marker.tag as Long
<<<<<<< HEAD
        doAsync {
            val hillfort = marker.tag as HillfortModel
            uiThread {
                if (hillfort != null) view?.showHillfort(hillfort)
            }
        }
=======
        val hillfort = app.users.findHillfortById(app.user, tag)
        if(hillfort != null)view?.showHillfort(hillfort)
>>>>>>> 377f6d9accf986e08b58ae4575005f9f6550becc

    }

    fun loadHillforts() {
        doAsync {
            val hillforts = app.hillforts.findAllHillforts()
            uiThread {
                view?.showHillforts(hillforts)
            }
        }
    }
}