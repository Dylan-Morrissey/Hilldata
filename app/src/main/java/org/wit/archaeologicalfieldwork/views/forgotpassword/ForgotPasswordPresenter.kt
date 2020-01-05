package org.wit.archaeologicalfieldwork.views.forgotpassword

import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.views.Base.BasePresenter
import org.wit.archaeologicalfieldwork.views.Base.BaseView
import org.wit.archaeologicalfieldwork.views.Base.VIEW

class ForgotPasswordPresenter (view: BaseView): BasePresenter(view){

    init {
        app =view.application as MainApp
    }

    fun doBack(){
        view?.navigateTo(VIEW.LOGIN)
    }

    fun doResetPassword(enteredEmail:String){

    }
}
