package org.wit.archaeologicalfieldwork.views.settings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_settings.*
import org.jetbrains.anko.info
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.views.hillfortlist.HillfortListView
import org.wit.archaeologicalfieldwork.views.login.LoginView

class SettingsPresenter (val view: SettingsView){

    var app : MainApp

    init {
        app = view.application as MainApp

    }

    fun doBackToList(){
        view.startActivity<HillfortListView>()
    }

    fun doDeleteUser(){
        app.users.deleteUser(app.user)
        view.toast("Account Deleted")
        view.startActivity<LoginView>()
    }

    fun doSaveSettings(){
        if (view.settingUserName.text.isNotEmpty() && view.settingEmail.text.isNotEmpty() && view.settingPassword.text.isNotEmpty()) {
            if (isEmailValid(view.settingEmail.text.toString()) == true) {
                app.user.userName = view.settingUserName.text.toString()
                app.user.emailAddress = view.settingEmail.text.toString()
                app.user.password = view.settingPassword.text.toString()
                app.users.updateUser(app.user.copy())
                view.info("Update Button Pressed:${app.user}")
                view.setResult(AppCompatActivity.RESULT_OK)
                view.finish()
                doBackToList()
            } else {
                view.toast("Please eneter a valid email address.")
            }
        } else {
            view.toast("Please fill in to register")
        }
    }

    fun doShowUserStats(){
        view.totalUserHillforts.setText(app.user.userName + "'s hillforts total : " + app.user.hillforts.size )
        var visited = 0
        var pictueCount = 0
        for (userhillfort in app.user.hillforts) {
            pictueCount += userhillfort.imageStore.size
            if (userhillfort.visited == true) {
                visited += 1
            }
        }

        view.hillfortsVisited.setText(app.user.userName + " hillfort visited total: " + visited)
        view.totalPictures.setText(app.user.userName + " pictue upload count: " + pictueCount)
        view.totalUsers.setText("Hilldata total number of users: " + app.users.findAllUsers().size)
        var users = app.users.findAllUsers()
        var hillfortCount = 0
        for (user in users) {
            hillfortCount += user.hillforts.size
        }
        view.totalHillforts.setText("Total hillforts on Hilldata: " + hillfortCount)
    }

    fun isEmailValid(email:String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

}