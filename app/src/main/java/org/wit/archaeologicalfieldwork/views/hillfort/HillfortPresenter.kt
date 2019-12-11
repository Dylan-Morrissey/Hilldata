package org.wit.archaeologicalfieldwork.views.hillfort

import android.content.Intent
import androidx.viewpager.widget.ViewPager
import org.jetbrains.anko.intentFor
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.activities.MapActivity
import org.wit.archaeologicalfieldwork.adapter.ImageAdapter
import org.wit.archaeologicalfieldwork.helpers.showImagePicker
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.models.LocationModel
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.models.UserModel

class HillfortPresenter(val view: HillfortView) {

    val IMAGE_REQUEST = 1
    val LOCATION_REQUEST = 2
    var user = UserModel()

    var hillfort = HillfortModel()
    var location = LocationModel(52.245696, -7.139102, 15f)
    var app: MainApp
    var edit = false;

    init {
        app = view.application as MainApp
        user = app.user
        if (view.intent.hasExtra("hillfort_edit")) {
            edit = true
            hillfort = view.intent.extras?.getParcelable<HillfortModel>("hillfort_edit")!!
            view.showHillfort(hillfort)
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
        view.finish()
    }

    fun doCancel() {
        view.finish()
    }

    fun doDelete() {
        app.users.deleteHillfort(hillfort.copy(), user)
    }

    fun doSelectImage(){
        showImagePicker(view, IMAGE_REQUEST)
    }

    fun doCheckBox(checkBox: Boolean) {
        hillfort.visited = checkBox
    }

    fun doSetLocation() {
        if (hillfort.zoom !=0f) {
            location.lat = hillfort.lat
            location.lng = hillfort.lng
            location.zoom = hillfort.zoom
        }
        view.startActivityForResult(view.intentFor<MapActivity>().putExtra("location", location), LOCATION_REQUEST)
    }

    fun doActivityResult(requestCode:Int, resultCode: Int, data: Intent) {
        when (requestCode) {
            IMAGE_REQUEST ->{
                if(data != null) {
                    hillfort.image = data.data.toString()
                    hillfort.imageStore.add(hillfort.image)
                    val images = view.findViewById<ViewPager>(R.id.hillfortImages)
                    val adapter = ImageAdapter(view, hillfort.imageStore)
                    images.adapter = adapter
                }
            }
            LOCATION_REQUEST -> {
                location = data.extras?.getParcelable<LocationModel>("location")!!
                hillfort.lat = location.lat
                hillfort.lng = location.lng
                hillfort.zoom = location.zoom
            }
        }
    }
}