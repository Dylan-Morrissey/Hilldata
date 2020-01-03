package org.wit.archaeologicalfieldwork.main

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.archaeologicalfieldwork.models.json.HillfortJSONStore
import org.wit.archaeologicalfieldwork.models.HillfortStore
import org.wit.archaeologicalfieldwork.models.firebase.HillfortFireStore

class MainApp : Application(), AnkoLogger {

    lateinit var  hillforts: HillfortStore

    override fun onCreate() {
        super.onCreate()
        //hillforts = HillfortJSONStore(applicationContext)
        hillforts = HillfortFireStore(applicationContext)
        info("Hilfort and user started")
    }
}