package org.wit.archaeologicalfieldwork.main

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.archaeologicalfieldwork.models.*
import org.wit.archaeologicalfieldwork.models.UserJSONStore
import org.wit.archaeologicalfieldwork.models.UserModel
import org.wit.archaeologicalfieldwork.models.UserStore

class MainApp : Application(), AnkoLogger {

    lateinit var  users:UserStore
    lateinit var  user:UserModel

    override fun onCreate() {
        super.onCreate()
        users = UserJSONStore(applicationContext)
        info("Hilfort and user started")
    }
}