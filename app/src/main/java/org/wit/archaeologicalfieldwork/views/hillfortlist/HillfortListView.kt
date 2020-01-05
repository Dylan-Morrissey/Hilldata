package org.wit.archaeologicalfieldwork.views.hillfortlist

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_hillfort_list.*
import org.jetbrains.anko.AnkoLogger
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.adapter.HillfortAdapter
import org.wit.archaeologicalfieldwork.adapter.HillfortListener
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.views.Base.BaseView

class HillfortListView: BaseView(), HillfortListener, AnkoLogger {

    lateinit var presenter: HillfortListPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hillfort_list)
        super.init(toolbar, false)

        presenter = initPresenter(HillfortListPresenter(this)) as HillfortListPresenter
        presenter = initPresenter(HillfortListPresenter(this)) as HillfortListPresenter
        toolbar.title = title
        super.init(toolbar, false)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        presenter.loadHillforts()
    }


    override fun showHillforts(hillforts: List<HillfortModel>) {
        recyclerView.adapter = HillfortAdapter(hillforts, this)
        recyclerView.adapter?.notifyDataSetChanged()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_hillfortlist, menu)
        val item = menu?.findItem(R.id.menu_search)
        val searchView: SearchView = item?.actionView as SearchView

        searchView.isSubmitButtonEnabled = true
        searchView.queryHint = "Enter A Name..."
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

            override fun onQueryTextChange(currentText: String): Boolean {
                presenter.doSearchHillforts(currentText)
                return true
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                presenter.doSearchHillforts(query)
                return true
            }
        })

        searchView.setOnCloseListener {
            presenter.loadHillforts()
            true
        }

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.item_add -> presenter.doAddHillfort()
            R.id.item_list_logout -> presenter.doLogout()
            R.id.item_list_settings -> presenter.doSettings()
            R.id.item_map -> presenter.doShowHillfortsMap()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onHillfortClick(hillfort: HillfortModel) {
        presenter.doEditHillfort(hillfort)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        presenter.loadHillforts()
        super.onActivityResult(requestCode, resultCode, data)
    }
}

