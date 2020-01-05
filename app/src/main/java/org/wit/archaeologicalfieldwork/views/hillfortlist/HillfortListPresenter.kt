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
    var alerady = false
    val hillforts = app.hillforts.findAllHillforts()

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

    fun loadHillforts() {
        doAsync {

            uiThread {
                if (hillforts != null) {
                    currentHillforts = hillforts
                    view?.showHillforts(hillforts)
                }
            }
        }
    }
    var fav = app.hillforts.findAllFavorites()
    fun doLoadFavorites() {

            if (fav != null) {
                currentHillforts = fav
                view?.showHillforts(fav)
            } else {
            view?.showHillforts(hillforts)
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