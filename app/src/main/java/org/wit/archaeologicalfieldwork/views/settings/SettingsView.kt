package org.wit.archaeologicalfieldwork.views.settings


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_settings.*
import org.jetbrains.anko.*
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.views.hillfortlist.HillfortListView
import org.wit.archaeologicalfieldwork.views.login.LoginView

class SettingsView : AppCompatActivity(), AnkoLogger {

    lateinit var presenter : SettingsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = SettingsPresenter(this)
        setContentView(R.layout.activity_settings)


        settingUserName.setText(presenter.app.user.userName)
        settingEmail.setText(presenter.app.user.emailAddress)
        settingPassword.setText(presenter.app.user.password)

        btnBackToList.setOnClickListener {
            presenter.doBackToList()
        }

        btnSaveSettings.setOnClickListener {
            presenter.doSaveSettings()
        }

        deleteUserBtn.setOnClickListener {
            presenter.doDeleteUser()
        }

        presenter.doShowUserStats()
    }
}
