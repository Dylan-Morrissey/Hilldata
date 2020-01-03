package org.wit.archaeologicalfieldwork.models

interface UserStore {
    fun findAllUsers():List<UserModel>
    fun createUser(user:UserModel)
    fun updateUser(user: UserModel)
    fun deleteUser(user: UserModel)
    fun findUser(id:Long): UserModel?
    fun findUserEmail(email: String): UserModel?
    fun findHillfortById(user:UserModel, id: Long) : HillfortModel?
    fun findAllHillforts(user: UserModel):List<HillfortModel>
    fun createHillfort(hillfort:HillfortModel, user: UserModel)
    fun updateHillfort(hillfort: HillfortModel, user: UserModel)
    fun deleteHillfort(hillfort: HillfortModel, user: UserModel)
    fun findCurrentUser():UserModel
}