package org.wit.archaeologicalfieldwork.models

import android.os.Parcelable
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HillfortModel(var id: Long = 0,
                         var name: String=" ",
                         var description: String= "",
                         var image:String="",
                         var lat:Double =0.0,
                         var lng:Double =0.0,
                         var zoom:Float =0f):Parcelable
