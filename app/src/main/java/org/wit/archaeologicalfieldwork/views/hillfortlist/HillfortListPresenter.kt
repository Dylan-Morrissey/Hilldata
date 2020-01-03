package org.wit.archaeologicalfieldwork.views.hillfortlist

import com.google.firebase.auth.FirebaseAuth
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.startActivityForResult
import org.wit.archaeologicalfieldwork.views.map.HillfortMapView
import org.wit.archaeologicalfieldwork.views.login.LoginView
import org.wit.archaeologicalfieldwork.views.settings.SettingsView
import org.wit.archaeologicalfieldwork.main.MainApp
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.models.UserModel
import org.wit.archaeologicalfieldwork.views.Base.BasePresenter
import org.wit.archaeologicalfieldwork.views.Base.BaseView
import org.wit.archaeologicalfieldwork.views.Base.VIEW
import org.wit.archaeologicalfieldwork.views.hillfort.HillfortView

class HillfortListPresenter(view: BaseView): BasePresenter(view) {

    var user: UserModel

    init {
        user = app.users.findCurrentUser()
    }

    fun getHillforts() = app.users.findAllHillforts(user)

    fun doAddHillfort() {
        view?.navigateTo(VIEW.HILLFORT)
    }

    fun doLogout(){
        FirebaseAuth.getInstance().signOut()
        view?.navigateTo(VIEW.LOGIN)
    }

    fun doSettings() {
        view?.navigateTo(VIEW.SETTINGS)
    }

    fun doEditHillfort(hillfort: HillfortModel){
        view?.navigateTo(VIEW.HILLFORT,0,"hillfort_edit", hillfort)
    }

    fun doShowHillfortsMap() {
        view?.navigateTo(VIEW.MAPS)
    }
}