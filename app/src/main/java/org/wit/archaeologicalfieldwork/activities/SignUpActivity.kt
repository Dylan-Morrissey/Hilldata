package org.wit.archaeologicalfieldwork.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.R

class SignUpActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        info("Login Activity Started...")

        btnRegester.setOnClickListener() {
            if (newUsername.text.toString().isEmpty()){
                toast("Please enter a username")
            } else if (newEmail.text.toString().isEmpty()){
                toast("Please enter an email address")
            } else if (newPassword.text.toString().isEmpty()) {
                toast("Please enter a password.")
            } else if (newPasswordConfirm.text.toString().isEmpty()){
                toast("Please confirm your password")
            }
        }

        btnBackSignIn.setOnClickListener() {
            val intent = Intent(baseContext, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
