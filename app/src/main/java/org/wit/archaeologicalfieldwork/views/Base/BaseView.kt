package org.wit.archaeologicalfieldwork.views.Base
import android.content.Intent
import android.location.Location
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import org.jetbrains.anko.AnkoLogger
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.views.editlocation.EditLocationPresenter
import org.wit.archaeologicalfieldwork.views.editlocation.*
import org.wit.archaeologicalfieldwork.views.forgotpassword.ForgotPasswordView
import org.wit.archaeologicalfieldwork.views.hillfort.HillfortView
import org.wit.archaeologicalfieldwork.views.login.LoginView
import org.wit.archaeologicalfieldwork.views.hillfortlist.HillfortListView
import org.wit.archaeologicalfieldwork.views.map.HillfortMapView
import org.wit.archaeologicalfieldwork.views.settings.SettingsView
import org.wit.archaeologicalfieldwork.views.signup.SignUpView
import org.wit.archaeologicalfieldwork.views.splashscreen.SplashScreenView

val IMAGE_REQUEST = 1
val LOCATION_REQUEST = 2

enum class VIEW {
    LOCATION,HILLFORT,MAPS,HILLFORTLIST,SPLASHSCREEN,LOGIN, FORGOTPASSWORD, SETTINGS, SIGNUP
}

open abstract class BaseView(): AppCompatActivity(), AnkoLogger {

    var basePresenter: BasePresenter? = null

    fun navigateTo(view: VIEW, code:Int = 0, key:String = "", value: Parcelable? = null){
        var intent = Intent(this,HillfortListView::class.java)
        when(view){
            VIEW.LOCATION -> intent = Intent(this, EditLocationView::class.java)
            VIEW.HILLFORT -> intent = Intent(this,HillfortView::class.java)
            VIEW.MAPS -> intent = Intent(this,HillfortMapView::class.java)
            VIEW.HILLFORTLIST -> intent = Intent(this,HillfortListView::class.java)
            VIEW.LOGIN -> intent = Intent(this, LoginView::class.java)
            VIEW.SPLASHSCREEN -> intent = Intent(this, SplashScreenView::class.java)
            VIEW.FORGOTPASSWORD -> intent = Intent(this, ForgotPasswordView::class.java)
            VIEW.SETTINGS -> intent = Intent(this, SettingsView::class.java)
            VIEW.SIGNUP -> intent = Intent(this, SignUpView::class.java)
        }
        if (key != ""){
            intent.putExtra(key,value)
        }
        startActivityForResult(intent,code)
    }

    fun initPresenter(presenter: BasePresenter): BasePresenter {
        basePresenter = presenter
        return presenter
    }

    fun init(toolbar: Toolbar) {
        toolbar.title = title
        setSupportActionBar(toolbar)
    }

    override fun onDestroy() {
        basePresenter?.onDestrop()
        super.onDestroy()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null) {
            basePresenter?.doActivityResult(requestCode,resultCode,data)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        basePresenter?.doRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    open fun showHillfort(hillfort: HillfortModel) {}
    open fun showHillforts(hillfort: List<HillfortModel>) {}
    open fun showProgress() {}
    open fun hideProgress() {}

    open fun putHillfort(hillFortModel: HillfortModel){}
    open fun addImages(listofImages: ArrayList<String>) {}
    open fun showResult(hillFortModel: HillfortModel){}
    open fun showLocation(hillFortModel: HillfortModel, location: Location){}
    //open fun showImages(images: hillfort.imageview){}
    open fun showHillfortAdd(){}
    //open fun showNotes(notes: hillfort.notes) {}
    //open fun setMarkerDetails(hillfort.imageview,hillFortModel: HillFortModel) {}
    open fun registerSignIn(){}
}