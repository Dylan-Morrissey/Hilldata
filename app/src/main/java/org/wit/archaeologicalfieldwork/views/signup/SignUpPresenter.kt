package org.wit.archaeologicalfieldwork.views.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_signup.*
import org.jetbrains.anko.info
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.views.hillfortlist.HillfortListView
import org.wit.archaeologicalfieldwork.views.login.LoginView

class SignUpPresenter (val view: SignUpView){

    var app: MainApp


    init {
        app =view.application as MainApp
    }


    fun doRegisterUser() {
        if (view.isEmailValid(view.newEmail.text.toString()) == true) {
            if (view.newPassword.text.toString() == view.newPasswordConfirm.text.toString()) {
                view.newuser.userName = view.newUsername.text.toString()
                view.newuser.emailAddress = view.newEmail.text.toString()
                view.newuser.password = view.newPassword.text.toString()
                app.users.createUser(view.newuser.copy())
                view.info("Register Button Pressed:${view.newuser}")
                view.setResult(AppCompatActivity.RESULT_OK)
                view.finish()
                view.startActivity<LoginView>()
            } else {
                view.newPassword.setText("")
                view.newPasswordConfirm.setText("")
                view.toast("Passwords do not match Please try again")
            }
        } else {
            view.toast("Please eneter a valid email address.")
        }
    }
}