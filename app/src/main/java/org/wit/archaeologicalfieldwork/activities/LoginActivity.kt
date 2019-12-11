package org.wit.archaeologicalfieldwork.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.views.hillfortlist.HillfortListActivity

class LoginActivity : AppCompatActivity(), AnkoLogger {

    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        app = application as MainApp

        info("Login Activity Started...")

        btnForgotPassword.setOnClickListener() {
            startActivity(Intent(baseContext, ForgotPasswordActivity::class.java))
        }
        btnSignUp.setOnClickListener() {
            startActivity(Intent(baseContext, SignUpActivity::class.java))
        }

        btnSignIn.setOnClickListener() {
            if (loginEmail.text.toString().isNotEmpty() && loginPassword.text.toString().isNotEmpty()) {
                for (x in app.users.findAllUsers()) {
                    if (x.emailAddress == loginEmail.text.toString() && x.password == loginPassword.text.toString()) {
                        app.user = app.users.findUser(x.id)!!
                        startActivity(Intent(baseContext, HillfortListActivity::class.java))
                        finish()
                    } else {
                        info { "Invalid Email or Password" }
                    }
                }
            } else {
                toast("Please make sure user name and password  are correct.")
            }
        }
    }

    private fun loadUsers() {
        app.users.findAllUsers()
    }

}
