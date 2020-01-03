package org.wit.archaeologicalfieldwork.views.hillfortlist

import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.startActivityForResult
import org.wit.archaeologicalfieldwork.views.map.HillfortMapView
import org.wit.archaeologicalfieldwork.views.login.LoginView
import org.wit.archaeologicalfieldwork.views.settings.SettingsView
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.models.UserModel
import org.wit.archaeologicalfieldwork.views.hillfort.HillfortView

class HillfortListPresenter(val view: HillfortListView) {

    var app:MainApp
    var user: UserModel


    init {
        app = view.application as MainApp
        user = app.users.findCurrentUser()
    }

    fun getHillforts() = app.users.findAllHillforts(user)

    fun doAddHillfort() {
        view.startActivityForResult<HillfortView>(0)
    }

    fun doLogout(){
        view.startActivity<LoginView>()
    }

    fun doSettings() {
        view.startActivity<SettingsView>()
    }

    fun doEditHillfort(hillfort: HillfortModel){
        view.startActivityForResult(view.intentFor<HillfortView>().putExtra("hillfort_edit", hillfort), 0)
    }

    fun doShowHillfortsMap() {
        view.startActivity<HillfortMapView>()
    }
}