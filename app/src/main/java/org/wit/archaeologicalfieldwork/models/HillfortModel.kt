package org.wit.archaeologicalfieldwork.models

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity
data class HillfortModel(@PrimaryKey(autoGenerate = true) var id: Long = 0,
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