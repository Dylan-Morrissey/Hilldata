package org.wit.archaeologicalfieldwork.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.email
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.main.MainApp

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
        loadUsers()

        btnSignIn.setOnClickListener() {
            if (loginEmail.text.toString().isEmpty()) {
                //toast("Please enter an email address.")
                startActivity(Intent(baseContext, HillfortListActivity::class.java))

            } else if (loginPassword.text.toString().isEmpty()) {
                toast("Please enter a password.")
            }
        }
    }
    private fun loadUsers() {
        app.users.findAll()
    }
}
