package org.wit.archaeologicalfieldwork.views.hillfortlist

import com.google.firebase.auth.FirebaseAuth
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.views.Base.BasePresenter
import org.wit.archaeologicalfieldwork.views.Base.BaseView
import org.wit.archaeologicalfieldwork.views.Base.VIEW

class HillfortListPresenter(view: BaseView): BasePresenter(view) {


    fun doAddHillfort() {
        view?.navigateTo(VIEW.HILLFORT)
    }

    fun doEditHillfort(hillfort: HillfortModel){
        view?.navigateTo(VIEW.HILLFORT,0,"hillfort_edit", hillfort)
    }

    fun doShowHillfortsMap() {
        view?.navigateTo(VIEW.MAPS)
    }

    fun loadHillforts() {
        doAsync {
            val hillforts = app.hillforts.findAllHillforts()
            uiThread {
                view?.showHillforts(hillforts)
            }
        }
    }

    fun doLogout(){
        FirebaseAuth.getInstance().signOut()
        view?.navigateTo(VIEW.LOGIN)
    }

    fun doSettings() {
        view?.navigateTo(VIEW.SETTINGS)
    }






}