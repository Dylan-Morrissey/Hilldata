package org.wit.archaeologicalfieldwork.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fieldword.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.main.MainApp

class FieldworkActivity : AppCompatActivity(), AnkoLogger {

    var hillfort = HillfortModel()
    lateinit var app:MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fieldword)
        app= application as MainApp

        btnAdd.setOnClickListener() {
            hillfort.name = hillfortName.text.toString()
            hillfort.description = description.text.toString()
            if (hillfort.name.isNotEmpty()) {
                app.hillforts.add(hillfort.copy())
                info("add Button Pressed:${hillfort}")
                for (i in app.hillforts.indices) {
                    info("Hillfort[$i]:${app.hillforts[i]}")
                }
                setResult(AppCompatActivity.RESULT_OK)
                finish()
            } else {
                toast("Please Enter a title")
            }
        }
    }
}
