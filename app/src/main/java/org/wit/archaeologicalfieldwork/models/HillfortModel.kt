package org.wit.archaeologicalfieldwork.models

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity
data class HillfortModel(@PrimaryKey(autoGenerate = true) var id: Long = 0,
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
