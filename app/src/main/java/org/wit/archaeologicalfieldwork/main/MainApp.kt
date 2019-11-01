package org.wit.archaeologicalfieldwork.main

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.archaeologicalfieldwork.models.*

class MainApp : Application(), AnkoLogger {

    lateinit var  users:UserStore
    lateinit var  user:UserModel

    override fun onCreate() {
        super.onCreate()
        users = UserJSONStore(applicationContext)
        info("Hilfort and user started")
    }
}