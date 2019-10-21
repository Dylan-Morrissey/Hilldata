package org.wit.archaeologicalfieldwork.main

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.archaeologicalfieldwork.models.HillfortModel

class MainApp : Application(), AnkoLogger {

    val hillforts = ArrayList<HillfortModel>()

    override fun onCreate() {
        super.onCreate()
        info("Hilfort started")
        hillforts.add(HillfortModel("One", "About one..."))
        hillforts.add(HillfortModel("Two", "About Two..."))
        hillforts.add(HillfortModel("Three", "About Three..."))
    }
}