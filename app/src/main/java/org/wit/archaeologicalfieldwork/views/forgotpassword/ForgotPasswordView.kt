package org.wit.archaeologicalfieldwork.views.forgotpassword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_forgotpassword.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.views.login.LoginView

class ForgotPasswordView : AppCompatActivity(), AnkoLogger {


    lateinit var presenter : ForgotPasswordPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpassword)
        info("Login Activity Started...")
        presenter = ForgotPasswordPresenter(this)

        btnBackToLogin.setOnClickListener() {
            presenter.doBack()
        }

        btnResetPassword.setOnClickListener() {
            presenter.doResetPassword(forgotEmail.text.toString())
        }
    }
}
