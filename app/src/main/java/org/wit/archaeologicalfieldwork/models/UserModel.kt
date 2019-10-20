package org.wit.archaeologicalfieldwork.models

import android.os.Parcelable
import android.provider.ContactsContract
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserModel (

    var userName: String="",
    var emailAddress: String="",
    var password: String=""

) : Parcelable
