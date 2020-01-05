package org.wit.archaeologicalfieldwork.views.hillfortlist

import com.google.firebase.auth.FirebaseAuth
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.models.firebase.HillfortFireStore
import org.wit.archaeologicalfieldwork.views.Base.BasePresenter
import org.wit.archaeologicalfieldwork.views.Base.BaseView
import org.wit.archaeologicalfieldwork.views.Base.VIEW

class HillfortListPresenter(view: BaseView): BasePresenter(view) {

    var fireStore: HillfortFireStore? = null
    var currentHillforts: List<HillfortModel> = arrayListOf()

    fun doSearchHillforts(name: String) {
        val searchResults = app.hillforts.findHillfortName(name)
        if (searchResults!= null) {
            currentHillforts = searchResults
            view?.showHillforts(searchResults)
        }

    }

    fun doAddHillfort() {
        view?.navigateTo(VIEW.HILLFORT)
    }

    fun doEditHillfort(hillfort: HillfortModel){
        view?.navigateTo(VIEW.HILLFORT,0,"hillfort_edit", hillfort)
    }

    fun doShowHillfortsMap() {
        view?.navigateTo(VIEW.MAPS)
    }

    fun clearSearch(){
        fireStore?.clearSearch()
    }

    fun clear() {
        app.hillforts.clear()
    }

    fun loadHillforts() {
        doAsync {
            val hillforts = app.hillforts.findAllHillforts()
            uiThread {
                if (hillforts != null) {
                    currentHillforts = hillforts
                    view?.showHillforts(hillforts)
                }
            }
        }
    }

    fun doLogout() {
        app.hillforts.clear()
        FirebaseAuth.getInstance().signOut()
        view?.navigateTo(VIEW.LOGIN)
    }

    fun doSettings() {
        view?.navigateTo(VIEW.SETTINGS)
    }

}