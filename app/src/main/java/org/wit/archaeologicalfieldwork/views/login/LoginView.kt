package org.wit.archaeologicalfieldwork.views.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.R

class LoginView : AppCompatActivity(), AnkoLogger {

    lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        presenter = LoginPresenter(this)

        info("Login Activity Started...")

        btnForgotPassword.setOnClickListener() {
            presenter.doForgotPassword()
        }
        btnSignUp.setOnClickListener() {
            presenter.doSignUp()
        }

        btnSignIn.setOnClickListener() {
            if (loginEmail.text.toString().isNotEmpty() && loginPassword.text.toString().isNotEmpty()) {
                presenter.doSignIn(loginEmail.text.toString(), loginPassword.text.toString())
            } else {
                toast("Please make sure user name and password  are correct.")
            }
        }
    }
}
