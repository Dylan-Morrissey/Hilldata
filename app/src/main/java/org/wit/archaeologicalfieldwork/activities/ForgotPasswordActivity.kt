package org.wit.archaeologicalfieldwork.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_forgotpassword.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.main.MainApp

class ForgotPasswordActivity : AppCompatActivity(), AnkoLogger {
    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        app = application as MainApp
        setContentView(R.layout.activity_forgotpassword)
        info("Login Activity Started...")

        btnBackToLogin.setOnClickListener() {
            val intent = Intent(baseContext, LoginActivity::class.java)
            startActivity(intent)
        }

        btnResetPassword.setOnClickListener() {
            for (x in app.users.findAllUsers()){
                if (forgotEmail.text.toString() == x.emailAddress) {
                    info { "forgot button pressed" }
                    toast("Password: " + x.password)
                } else {
                    toast("Invalid email address")
                }
            }
        }
    }
}
