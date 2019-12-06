package org.wit.archaeologicalfieldwork.models


import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import org.jetbrains.anko.AnkoLogger
import org.wit.archaeologicalfieldwork.helpers.exists
import org.wit.archaeologicalfieldwork.helpers.read
import org.wit.archaeologicalfieldwork.helpers.write
import org.wit.archaeologicalfieldwork.helpers.*
import java.util.*

private val JSON_FILE = "users.json"
private val gsonBuilder = GsonBuilder().setPrettyPrinting().create()
private val listType = object : TypeToken<java.util.ArrayList<UserModel>>() {}.type

private fun generateRandomId(): Long {
    return Random().nextLong()
}

class UserJSONStore : UserStore, AnkoLogger {

    val context: Context
    var users = mutableListOf<UserModel>()

    constructor (context: Context) {
        this.context = context
        if (exists(context, JSON_FILE)) {
            deserialize()
        }
    }

    override fun findUser(id: Long): UserModel? {
        val finduser: UserModel? = users.find { p -> p.id == id}
        return finduser
    }

    override fun findHillfortById(user: UserModel, id: Long): HillfortModel? {
        val foundHillfort: HillfortModel? = user.hillforts.find{ p -> p.id == id}
        return foundHillfort
    }

    override fun findUserEmail(email: String): UserModel? {
        for (user in users){
            if (user.emailAddress == email){
                return user
            }
        }
        return null
    }

    override fun findAllUsers(): List<UserModel> {
        return users
    }


    override fun createUser(user: UserModel) {
        user.id = generateRandomId()
        users.add(user)
        serialize()
    }

    override fun updateUser(user: UserModel) {
        val foundUsers: UserModel? = users.find { hill -> hill.id == user.id }
        if (foundUsers != null){
            foundUsers.id = user.id
            foundUsers.userName = user.userName
            foundUsers.emailAddress = user.emailAddress
            foundUsers.password = user.password
            foundUsers.hillforts = user.hillforts
        }
        serialize()
    }

    override fun deleteUser(user: UserModel){
        val foundUsers: UserModel? = users.find { p -> p.id == user.id }
        if (foundUsers != null){
            users.remove(foundUsers.copy())
            serialize()
        }
    }

    override fun createHillfort(hillfortModel: HillfortModel, user: UserModel) {
        hillfortModel.id = generateRandomId()
        user.hillforts.add(hillfortModel)
        var foundUser: UserModel? = users.find { p -> p.id == user.id }
        if (foundUser != null) {
            foundUser.hillforts = user.hillforts
            serialize()
        }
    }

    override fun findAllHillforts(user: UserModel): List<HillfortModel> {
        return user.hillforts
    }

    override fun updateHillfort(hillfortModel: HillfortModel, user: UserModel) {
        var foundUser: UserModel? = users.find { p -> p.id == user.id }
        if (foundUser != null) {
            for (hillfort in foundUser.hillforts) {
                if (hillfort.id == hillfortModel.id){
                    hillfort.name = hillfortModel.name
                    hillfort.description = hillfortModel.description
                    hillfort.imageStore = hillfortModel.imageStore
                    hillfort.lat = hillfortModel.lat
                    hillfort.lng = hillfortModel.lng
                    hillfort.zoom = hillfort.zoom
                    hillfort.visited = hillfortModel.visited
                    hillfort.date = hillfortModel.date
                    hillfort.notes = hillfortModel.notes
                    serialize()
                }
            }
        }
    }

    override fun deleteHillfort(hillfortModel: HillfortModel,user: UserModel) {
        var foundUser: UserModel? = users.find { p -> p.id == user.id }
        if (foundUser != null) {
            for (hillforts in foundUser.hillforts) {
                if (hillforts.id == hillfortModel.id){
                    user.hillforts.remove(hillfortModel)
                    serialize()
                }
            }
        }
    }

    private fun serialize() {
        val jsonString = gsonBuilder.toJson(users, listType)
        write(context, JSON_FILE, jsonString)
    }

    private fun deserialize() {
        val jsonString = read(context, JSON_FILE)
        users = Gson().fromJson(jsonString, listType)
    }
}