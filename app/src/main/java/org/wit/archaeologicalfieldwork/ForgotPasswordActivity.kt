package org.wit.archaeologicalfieldwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_forgotpassword.*
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.intentFor

class ForgotPasswordActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpassword)
        info("Login Activity Started...")

        btnBackToLogin.setOnClickListener() {
            val intent = Intent(baseContext, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
