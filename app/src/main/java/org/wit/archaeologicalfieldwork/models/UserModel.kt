package org.wit.archaeologicalfieldwork.models

import android.os.Parcelable
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserModel (

    var id: Long = 0,
    var userName: String="",
    var emailAddress: String="",
    var password: String="",
    var hillforts: ArrayList<HillfortModel> = ArrayList<HillfortModel>()
):Parcelable

