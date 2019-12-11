package org.wit.archaeologicalfieldwork.views.login

import org.wit.archaeologicalfieldwork.main.MainApp

class LoginPresenter (val view: LoginView){

    var app: MainApp

    init {
        app = view.application as MainApp
    }

    fun doForgotPassword(){

    }

    fun doSignUp(){

    }

}