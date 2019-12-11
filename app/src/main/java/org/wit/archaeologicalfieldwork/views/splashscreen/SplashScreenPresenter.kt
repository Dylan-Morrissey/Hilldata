package org.wit.archaeologicalfieldwork.views.splashscreen

import org.jetbrains.anko.startActivity
import org.wit.archaeologicalfieldwork.views.login.LoginView
import org.wit.archaeologicalfieldwork.main.MainApp
import java.lang.Exception

class SplashScreenPresenter (val view: SplashScreenView){
    var app: MainApp

    init {
        app = view.application as MainApp
    }

    fun doLoginPage() {
        val background = object  : Thread() {
            override fun run() {
                try {
                    Thread.sleep(3000)
                    view.startActivity<LoginView>()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }


}