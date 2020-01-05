package org.wit.archaeologicalfieldwork.views.login

import com.google.firebase.auth.FirebaseAuth
import org.jetbrains.anko.info
import org.jetbrains.anko.toast

<<<<<<< HEAD
import org.wit.archaeologicalfieldwork.models.firebase.HillfortFireStore
=======
>>>>>>> 377f6d9accf986e08b58ae4575005f9f6550becc
import org.wit.archaeologicalfieldwork.views.Base.BasePresenter
import org.wit.archaeologicalfieldwork.views.Base.BaseView
import org.wit.archaeologicalfieldwork.views.Base.VIEW

class LoginPresenter (view: BaseView): BasePresenter(view){
<<<<<<< HEAD

    var auth: FirebaseAuth = FirebaseAuth.getInstance()
    var fireStore: HillfortFireStore? = null

    init {
        if (app.hillforts is HillfortFireStore) {
            fireStore = app.hillforts as HillfortFireStore
        }
    }
=======
>>>>>>> 377f6d9accf986e08b58ae4575005f9f6550becc

    fun doForgotPassword(){
        view?.navigateTo(VIEW.FORGOTPASSWORD)
    }

    fun doSignUp(){
        view?.navigateTo(VIEW.SIGNUP)
    }

    fun doSignIn(loginEmail:String, loginPassword: String) {
<<<<<<< HEAD
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
=======
        for (x in app.users.findAllUsers()) {
            if (x.emailAddress == loginEmail && x.password == loginPassword) {
                app.user = app.users.findUser(x.id)!!
                view?.navigateTo(VIEW.HILLFORTLIST)
                view?.finish()
            } else {
                view?.info { "Invalid Email or Password" }
>>>>>>> 377f6d9accf986e08b58ae4575005f9f6550becc
            }
        }
    }
}