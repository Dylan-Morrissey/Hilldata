package org.wit.archaeologicalfieldwork.views.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.views.Base.BaseView

<<<<<<< HEAD
class LoginView : BaseView(), AnkoLogger {
=======
class LoginView : BaseView() {
>>>>>>> 377f6d9accf986e08b58ae4575005f9f6550becc

    lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        presenter = initPresenter(LoginPresenter(this)) as LoginPresenter
<<<<<<< HEAD
        progressBar.visibility = View.GONE
=======
>>>>>>> 377f6d9accf986e08b58ae4575005f9f6550becc

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

    override fun showProgress() {
        progressBar.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        progressBar.visibility = View.GONE
    }
}
