package org.wit.archaeologicalfieldwork.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.wit.archaeologicalfieldwork.R

import kotlinx.android.synthetic.main.activity_hillfort_maps.*

class HillfortMapActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hillfort_maps)
        toolbarMap.title = title
        setSupportActionBar(toolbarMap)

    }
}