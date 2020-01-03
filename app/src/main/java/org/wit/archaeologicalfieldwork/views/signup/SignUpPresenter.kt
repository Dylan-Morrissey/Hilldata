package org.wit.archaeologicalfieldwork.views.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_signup.*
import org.jetbrains.anko.info
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.views.Base.BasePresenter
import org.wit.archaeologicalfieldwork.views.Base.BaseView
import org.wit.archaeologicalfieldwork.views.Base.VIEW
import org.wit.archaeologicalfieldwork.views.hillfortlist.HillfortListView
import org.wit.archaeologicalfieldwork.views.login.LoginView

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