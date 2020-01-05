package org.wit.archaeologicalfieldwork.views.login

import com.google.firebase.auth.FirebaseAuth
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.models.firebase.HillfortFireStore
import org.wit.archaeologicalfieldwork.views.Base.BasePresenter
import org.wit.archaeologicalfieldwork.views.Base.BaseView
import org.wit.archaeologicalfieldwork.views.Base.VIEW

class LoginPresenter (view: BaseView): BasePresenter(view){

    var auth: FirebaseAuth = FirebaseAuth.getInstance()
    var fireStore: HillfortFireStore? = null

    init {
        if (app.hillforts is HillfortFireStore) {
            fireStore = app.hillforts as HillfortFireStore
        }
    }

    fun doForgotPassword(){
        view?.navigateTo(VIEW.FORGOTPASSWORD)
    }

    fun doSignUp(){
        view?.navigateTo(VIEW.SIGNUP)
    }

    fun doSignIn(loginEmail:String, loginPassword: String) {
        view?.showProgress()
        auth.signInWithEmailAndPassword(loginEmail, loginPassword).addOnCompleteListener(view!!) { task ->
            if (task.isSuccessful) {
                if (fireStore != null) {
                    fireStore!!.fetchHillforts {
                        view?.hideProgress()
                        view?.navigateTo(VIEW.HILLFORTLIST)
                    }
                } else {
                    view?.hideProgress()
                    view?.navigateTo(VIEW.HILLFORTLIST)
                }
            } else{
                view?.hideProgress()
                view?.toast("Incorrect Email address or Password")
            }
        }
    }
}