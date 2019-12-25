package org.wit.archaeologicalfieldwork.views.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.archaeologicalfieldwork.R

class SplashScreenView : AppCompatActivity(), AnkoLogger {

    lateinit var presenter: SplashScreenPresenter


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        info("Splash Screen View Started...")
        presenter = SplashScreenPresenter(this)
        presenter.doLoginPage()
    }
}
