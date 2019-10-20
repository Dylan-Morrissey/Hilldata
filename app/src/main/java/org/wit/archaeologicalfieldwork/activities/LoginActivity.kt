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

class LoginActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        info("Login Activity Started...")

        btnForgotPassword.setOnClickListener() {
            val intent = Intent(baseContext, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }
        btnSignUp.setOnClickListener() {
            val intent = Intent(baseContext, SignUpActivity::class.java)
            startActivity(intent)
        }

        btnSignIn.setOnClickListener() {
            if (loginEmail.text.toString().isEmpty()){
                toast("Please enter an email address.")
            } else if (loginPassword.text.toString().isEmpty()){
                toast("Please enter a password.")
            }
        }
    }
}
