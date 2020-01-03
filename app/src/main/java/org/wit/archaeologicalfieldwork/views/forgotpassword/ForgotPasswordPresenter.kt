package org.wit.archaeologicalfieldwork.views.forgotpassword

import kotlinx.android.synthetic.main.activity_forgotpassword.*
import org.jetbrains.anko.info
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.views.Base.BasePresenter
import org.wit.archaeologicalfieldwork.views.Base.BaseView
import org.wit.archaeologicalfieldwork.views.Base.VIEW
import org.wit.archaeologicalfieldwork.views.login.LoginView

class ForgotPasswordPresenter (view: BaseView): BasePresenter(view){

    init {
        app =view.application as MainApp
    }

    fun doBack(){
        view?.navigateTo(VIEW.LOGIN)
    }

    fun doResetPassword(enteredEmail:String){
        for (x in app.users.findAllUsers()){
            if (enteredEmail == x.emailAddress) {
                view?.info { "forgot button pressed" }
                view?.toast("Password: " + x.password)
            } else {
                view?.info("Invalid email address")
            }
        }
    }
}
