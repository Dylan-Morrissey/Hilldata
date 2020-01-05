package org.wit.archaeologicalfieldwork.views.settings


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import kotlinx.android.synthetic.main.activity_hillfort_list.*
import kotlinx.android.synthetic.main.activity_hillfort_list.toolbar
import kotlinx.android.synthetic.main.activity_map.*
import kotlinx.android.synthetic.main.activity_settings.*
import org.jetbrains.anko.*
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.views.Base.BaseView
import org.wit.archaeologicalfieldwork.views.hillfortlist.HillfortListView
import org.wit.archaeologicalfieldwork.views.login.LoginView

class SettingsView : BaseView(), AnkoLogger {

    lateinit var presenter : SettingsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = SettingsPresenter(this)

        setContentView(R.layout.activity_settings)
        init(toolbarSettings, true)

        //settingEmail.setText(presenter.app.)
        //settingPassword.setText(presenter.app.users.findCurrentUser().password)

        totalHillforts.setText("Total Hillforts: " + presenter.hillforts.size)

        hillfortsVisited.setText("Total Hillfort Visited: " + presenter.getVisited())

        hillfortRating.setText("Average Rating: " + presenter.getAverageRate())

        totalPictures.setText("Total Number of favorite: " + presenter.getFavourites())





        deleteUserBtn.setOnClickListener {
            presenter.doDeleteUser()
        }
    }
}
