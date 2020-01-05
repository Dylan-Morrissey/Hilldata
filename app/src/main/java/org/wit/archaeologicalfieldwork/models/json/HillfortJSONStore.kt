package org.wit.archaeologicalfieldwork.models.json

import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import org.jetbrains.anko.AnkoLogger
import org.wit.archaeologicalfieldwork.helpers.exists
import org.wit.archaeologicalfieldwork.helpers.read
import org.wit.archaeologicalfieldwork.helpers.write
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.models.HillfortStore
import java.util.*
import kotlin.collections.ArrayList

private val JSON_FILE = "hillfort.json"
private val gsonBuilder = GsonBuilder().setPrettyPrinting().create()
private val listType = object : TypeToken<java.util.ArrayList<HillfortModel>>() {}.type

private fun generateRandomId(): Long {
    return Random().nextLong()
}

class HillfortJSONStore : HillfortStore, AnkoLogger {
    override fun findHillfortName(name: String): ArrayList<HillfortModel> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clearSearch() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findSearchedHillforts(): List<HillfortModel> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    val context: Context
    var hillforts = mutableListOf<HillfortModel>()

    constructor (context: Context) {
        this.context = context
        if (exists(context, JSON_FILE)) {
            deserialize()
        }
    }

    override fun findAllHillforts(): MutableList<HillfortModel> {
        return hillforts
    }

    override fun createHillfort(hillfort: HillfortModel) {
        hillfort.id = generateRandomId()
        hillforts.add(hillfort)
        serialize()
    }

    override fun updateHillfort(hillfort: HillfortModel) {
        val hillfortsList = findAllHillforts() as ArrayList<HillfortModel>
        var foundHillfort: HillfortModel? = hillfortsList.find { p -> p.id == hillfort.id }
        if (foundHillfort != null) {
            foundHillfort.name = hillfort.name
            foundHillfort.description = hillfort.description
            foundHillfort.image = hillfort.image
            foundHillfort.location = hillfort.location
        }
        serialize()
    }

    override fun deleteHillfort(hillfort: HillfortModel) {
        hillforts.remove(hillfort)
        serialize()
    }

    override fun findHillfortById(id:Long) : HillfortModel? {
        val foundHillfort: HillfortModel? = hillforts.find { it.id == id }
        return foundHillfort
    }

    private fun serialize() {
        val jsonString = gsonBuilder.toJson(hillforts,
            listType
        )
        write(context, JSON_FILE, jsonString)
    }

    private fun deserialize() {
        val jsonString = read(context, JSON_FILE)
        hillforts = Gson().fromJson(jsonString, listType)
    }

    override fun clear() {
        hillforts.clear()
    }
}