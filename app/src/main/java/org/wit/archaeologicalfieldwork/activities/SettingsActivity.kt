package org.wit.archaeologicalfieldwork.activities


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_settings.*
import kotlinx.android.synthetic.main.activity_signup.*
import org.jetbrains.anko.*
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.models.HillfortModel

class SettingsActivity : AppCompatActivity(), AnkoLogger {

    lateinit var app: MainApp
    var hillfort = HillfortModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        app = application as MainApp

        settingUserName.setText(app.user.userName)
        settingEmail.setText(app.user.emailAddress)
        settingPassword.setText(app.user.password)

        btnBackToList.setOnClickListener {
            startActivity(Intent(baseContext,HillfortListActivity::class.java))
        }

        btnSaveSettings.setOnClickListener {
            if (settingUserName.text.isNotEmpty() && settingEmail.text.isNotEmpty() && settingPassword.text.isNotEmpty()) {
                if (isEmailValid(settingEmail.text.toString()) == true) {
                    app.user.userName = settingUserName.text.toString()
                    app.user.emailAddress = settingEmail.text.toString()
                    app.user.password = settingPassword.text.toString()
                    app.users.updateUser(app.user.copy())
                    info("Update Button Pressed:${app.user}")
                    setResult(RESULT_OK)
                    finish()
                    val intent = Intent(baseContext, HillfortListActivity::class.java)
                    startActivity(intent)

                } else {
                    toast("Please eneter a valid email address.")
                }
            } else {
                toast("Please fill in to register")
            }
        }

    }
    fun isEmailValid(email:String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }


}
