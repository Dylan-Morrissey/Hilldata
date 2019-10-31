package org.wit.archaeologicalfieldwork.main

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.archaeologicalfieldwork.models.HillfortJSONStore
import org.wit.archaeologicalfieldwork.models.*
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.models.HillfortStore

class MainApp : Application(), AnkoLogger {

    lateinit var  hillforts:HillfortStore
    lateinit var  users:UserStore

    override fun onCreate() {
        super.onCreate()
        users = UserJSONStore(applicationContext)
        hillforts = HillfortJSONStore(applicationContext)
        info("Hilfort and user started")
    }
}