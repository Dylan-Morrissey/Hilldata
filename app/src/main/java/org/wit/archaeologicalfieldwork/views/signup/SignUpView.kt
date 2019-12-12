package org.wit.archaeologicalfieldwork.views.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.models.UserModel
import org.wit.archaeologicalfieldwork.views.login.LoginView

class SignUpView : AppCompatActivity(), AnkoLogger {

    var newuser = UserModel()
    lateinit var presenter : SignUpPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        info("Login Activity Started...")
        presenter = SignUpPresenter(this)

        btnRegester.setOnClickListener() {
            if (newUsername.text.isNotEmpty() && newEmail.text.isNotEmpty() && newPassword.text.isNotEmpty() && newPasswordConfirm.text.isNotEmpty()) {
                presenter.doRegisterUser()
            } else {
                toast("Please fill in to register")
            }
        }

        btnBackSignIn.setOnClickListener() {
            val intent = Intent(baseContext, LoginView::class.java)
            startActivity(intent)
        }
    }

    fun isEmailValid(email:String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}
