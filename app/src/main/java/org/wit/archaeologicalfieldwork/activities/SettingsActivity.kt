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

        deleteUserBtn.setOnClickListener {
            app.users.deleteUser(app.user)
            toast("Account Deleted")
            startActivity(Intent(baseContext, LoginActivity::class.java))
        }



        totalUserHillforts.setText(app.user.userName + "'s hillforts total : " + app.user.hillforts.size )

        var visited = 0
        var pictueCount = 0
        for (userhillfort in app.user.hillforts) {
            pictueCount += userhillfort.imageStore.size
            if (userhillfort.visited == true) {
                visited += 1
            }
        }

        hillfortsVisited.setText(app.user.userName + " hillfort visited total: " + visited)
        totalPictures.setText(app.user.userName + " pictue upload count: " + pictueCount)
        totalUsers.setText("Hilldata total number of users: " + app.users.findAllUsers().size)
        var users = app.users.findAllUsers()
        var hillfortCount = 0
        for (user in users) {
            hillfortCount += user.hillforts.size
        }
        totalHillforts.setText("Total hillforts on Hilldata: " + hillfortCount)


    }
    fun isEmailValid(email:String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }


}
