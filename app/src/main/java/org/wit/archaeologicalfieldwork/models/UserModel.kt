package org.wit.archaeologicalfieldwork.models

import java.util.*

data class UserModel (

    var id: Long = 0,
    var userName: String="",
    var emailAddress: String="",
    var password: String=""
)
