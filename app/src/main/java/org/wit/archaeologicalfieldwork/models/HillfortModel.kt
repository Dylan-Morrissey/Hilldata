package org.wit.archaeologicalfieldwork.models

import android.os.Parcelable
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HillfortModel(var id: Long = 0,
                         var name: String="",
                         var description: String= "",
                         var image:String = "",
                         var imageStore: ArrayList<String> = ArrayList(),
                         var lat:Double =0.0,
                         var lng:Double =0.0,
                         var zoom:Float =0f,
                         var visited:Boolean =false,
                         var date: String = "",
                         var notes: String = ""):Parcelable
