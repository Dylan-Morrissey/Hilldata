package org.wit.archaeologicalfieldwork.views.forgotpassword

import kotlinx.android.synthetic.main.activity_forgotpassword.*
import org.jetbrains.anko.info
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.views.login.LoginView

class ForgotPasswordPresenter (val view: ForgotPasswordView){

    var app: MainApp

    init {
        app =view.application as MainApp
    }

    fun doBack(){
        view.startActivity<LoginView>()
    }

    fun doResetPassword(enteredEmail:String){
        for (x in app.users.findAllUsers()){
            if (enteredEmail == x.emailAddress) {
                view.info { "forgot button pressed" }
                view.toast("Password: " + x.password)
            } else {
                view.info("Invalid email address")
            }
        }
    }
}
