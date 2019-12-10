package org.wit.archaeologicalfieldwork.activities

import HillfortAdapter
import HillfortListener
import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_hillfort_list.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.models.UserModel
import org.wit.archaeologicalfieldwork.views.hillfort.HillfortView

class HillfortListActivity: AppCompatActivity(), HillfortListener, AnkoLogger {

    lateinit var user: UserModel
    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hillfort_list)
        app = application as MainApp

        toolbar.title = title
        setSupportActionBar(toolbar)

        user = app.user
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = HillfortAdapter(app.users.findAllHillforts(user), this)
        loadHillforts()

    }

    private fun loadHillforts() {
        showHillforts(app.users.findAllHillforts(user))
    }

    fun showHillforts(hillforts:List<HillfortModel>){
        recyclerView.adapter = HillfortAdapter(hillforts, this)
        recyclerView.adapter?.notifyDataSetChanged()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_hillfortlist, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.item_add -> startActivityForResult(intentFor<HillfortView>(), 0)
            R.id.item_list_logout -> startActivity(Intent(baseContext, LoginActivity::class.java))
            R.id.item_list_settings -> startActivity(Intent(baseContext,SettingsActivity::class.java))
            R.id.item_map -> startActivity <HillfortMapActivity>()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onHillfortClick(hillfort: HillfortModel) {
        startActivityForResult(intentFor<HillfortView>().putExtra("hillfort_edit", hillfort), 0)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        showHillforts(app.users.findAllHillforts(user))
        super.onActivityResult(requestCode, resultCode, data)
    }
}

