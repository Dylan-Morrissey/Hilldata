package org.wit.archaeologicalfieldwork.views.settings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_settings.*
import org.jetbrains.anko.info
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.views.hillfortlist.HillfortListView
import org.wit.archaeologicalfieldwork.views.login.LoginView

class SettingsPresenter (val view: SettingsView){

    var app : MainApp


    init {
        app = view.application as MainApp

    }


    fun doDeleteUser(){
        view.toast("Account Deleted")
        view.startActivity<LoginView>()
    }

    var hillforts: List<HillfortModel> = app.hillforts.findAllHillforts()!!


    fun getAverageRate(): Double {
        var average = 0.0
        if(hillforts.isEmpty()) {
            average = 0.0
        }
        else {
            hillforts.forEach {
                average += it.rating
            }
            average /= hillforts.size
        }
        return average
    }

    fun getFavourites(): Int {
        var favourites = 0
        hillforts.forEach {
            if (it.favorite) {
                favourites++
            }
        }
        return favourites
    }

    fun getVisited(): Int {
        var visited = 0
        hillforts.forEach {
            if (it.visited) {
                visited++
            }
        }
        return visited
    }

    fun getImages(): Int {
        var images = 0
        hillforts.forEach {
            images += it.image.length
        }
        return images
    }
}

    /*
    fun doSaveSettings(){
        if (view.settingUserName.text.isNotEmpty() && view.settingEmail.text.isNotEmpty() && view.settingPassword.text.isNotEmpty()) {
            if (isEmailValid(view.settingEmail.text.toString()) == true) {
                app.users.findCurrentUser().emailAddress = view.settingEmail.text.toString()
                app.users.findCurrentUser().password = view.settingPassword.text.toString()
                app.users.updateUser(app.users.findCurrentUser().copy())
                view.info("Update Button Pressed:${app.users.findCurrentUser()}")
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

     */
/*
    fun doShowUserStats(){
        view.totalUserHillforts.setText(app.users.findCurrentUser().emailAddress + "'s hillforts total : " + app.users.findCurrentUser().hillforts.size )
        var visited = 0
        var pictueCount = 0
        for (userhillfort in app.users.findCurrentUser().hillforts) {
            pictueCount += userhillfort.imageStore.size
            if (userhillfort.visited == true) {
                visited += 1
            }
        }

        view.hillfortsVisited.setText(app.users.findCurrentUser().emailAddress + " hillfort visited total: " + visited)
        view.totalPictures.setText(app.users.findCurrentUser().emailAddress + " pictue upload count: " + pictueCount)
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


 */
