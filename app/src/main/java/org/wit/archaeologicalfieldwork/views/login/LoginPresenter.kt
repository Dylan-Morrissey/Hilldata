package org.wit.archaeologicalfieldwork.views.login

import android.content.Intent
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.info
import org.jetbrains.anko.startActivity
import org.wit.archaeologicalfieldwork.activities.ForgotPasswordActivity
import org.wit.archaeologicalfieldwork.activities.SignUpActivity
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.views.hillfortlist.HillfortListView

class LoginPresenter (val view: LoginView){

    var app: MainApp

    init {
        app = view.application as MainApp
    }

    fun doForgotPassword(){
        view.startActivity<ForgotPasswordActivity>()
    }

    fun doSignUp(){
        view.startActivity<SignUpActivity>()
    }

    fun doSignIn(loginEmail:String, loginPassword: String) {
        for (x in app.users.findAllUsers()) {
            if (x.emailAddress == loginEmail && x.password == loginPassword) {
                app.user = app.users.findUser(x.id)!!
                view.startActivity<HillfortListView>()
                view.finish()
            } else {
                view.info { "Invalid Email or Password" }
            }
        }
    }
}