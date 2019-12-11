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

class SignUpActivity : AppCompatActivity(), AnkoLogger {

    var newuser = UserModel()
    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        app = application as MainApp
        info("Login Activity Started...")

        btnRegester.setOnClickListener() {
            if (newUsername.text.isNotEmpty() && newEmail.text.isNotEmpty() && newPassword.text.isNotEmpty() && newPasswordConfirm.text.isNotEmpty()) {
                if (isEmailValid(newEmail.text.toString()) == true) {
                    if (newPassword.text.toString() == newPasswordConfirm.text.toString()) {
                        newuser.userName = newUsername.text.toString()
                        newuser.emailAddress = newEmail.text.toString()
                        newuser.password = newPassword.text.toString()
                        app.users.createUser(newuser.copy())
                        info("Register Button Pressed:${newuser}")
                        setResult(RESULT_OK)
                        finish()
                        val intent = Intent(baseContext, LoginView::class.java)
                        startActivity(intent)
                    } else {
                        newPassword.setText("")
                        newPasswordConfirm.setText("")
                        toast("Passwords do not match Please try again")
                    }
                } else {
                    toast("Please eneter a valid email address.")
                }
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
