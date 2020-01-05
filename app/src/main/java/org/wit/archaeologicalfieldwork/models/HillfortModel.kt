package org.wit.archaeologicalfieldwork.models

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
<<<<<<< HEAD
import com.google.android.gms.maps.model.LatLng
=======
>>>>>>> 377f6d9accf986e08b58ae4575005f9f6550becc
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity
data class HillfortModel(@PrimaryKey(autoGenerate = true) var id: Long = 0,
<<<<<<< HEAD
                         var fbId: String = "",
                         var name: String="",
                         var description: String= "",
                         var visited:Boolean =false,
                         var date: String = "",
                         var notes: String = "",
                         var image: String = "",
                         @Embedded var location: LocationModel = LocationModel()):Parcelable

@Parcelize
data class LocationModel(var lat: Double = 0.0,
                    var lng: Double = 0.0,
                    var zoom: Float = 0f) : Parcelable

=======
                         var name: String="",
                         var description: String= "",
                         var image:String = "",
                         var imageStore: ArrayList<String> = ArrayList(),
                         var visited:Boolean =false,
                         var date: String = "",
                         var notes: String = "",
                         @Embedded var location : Location = Location() ):Parcelable

@Parcelize
data class Location(var lat: Double = 0.0,
                    var lng: Double = 0.0,
                    var zoom: Float = 0f) : Parcelable
>>>>>>> 377f6d9accf986e08b58ae4575005f9f6550becc
