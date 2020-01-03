package org.wit.archaeologicalfieldwork.views.login

import org.jetbrains.anko.info
import org.jetbrains.anko.startActivity
import org.wit.archaeologicalfieldwork.views.forgotpassword.ForgotPasswordView
import org.wit.archaeologicalfieldwork.views.signup.SignUpView
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.views.Base.BasePresenter
import org.wit.archaeologicalfieldwork.views.Base.BaseView
import org.wit.archaeologicalfieldwork.views.Base.VIEW
import org.wit.archaeologicalfieldwork.views.hillfortlist.HillfortListView

class LoginPresenter (view: BaseView): BasePresenter(view){

    fun doForgotPassword(){
        view?.navigateTo(VIEW.FORGOTPASSWORD)
    }

    fun doSignUp(){
        view?.navigateTo(VIEW.SIGNUP)
    }

    fun doSignIn(loginEmail:String, loginPassword: String) {
        for (x in app.users.findAllUsers()) {
            if (x.emailAddress == loginEmail && x.password == loginPassword) {
                app.user = app.users.findUser(x.id)!!
                view?.navigateTo(VIEW.HILLFORTLIST)
                view?.finish()
            } else {
                view?.info { "Invalid Email or Password" }
            }
        }
    }
}