package org.wit.archaeologicalfieldwork.views.signup

import com.google.firebase.auth.FirebaseAuth
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.views.Base.BasePresenter
import org.wit.archaeologicalfieldwork.views.Base.BaseView
import org.wit.archaeologicalfieldwork.views.Base.VIEW

class SignUpPresenter (view: BaseView): BasePresenter(view){

    var auth: FirebaseAuth = FirebaseAuth.getInstance()


    init {
        app =view.application as MainApp
    }


    fun doRegisterUser(email:String, password:String) {
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(view!!) { task ->
            if (task.isSuccessful) {
                view?.navigateTo(VIEW.HILLFORTLIST)
            } else {
                view?.toast("Sign Up Failed: ${task.exception?.message}")
            }
        }
    }
}