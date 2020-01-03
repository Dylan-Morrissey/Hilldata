package org.wit.archaeologicalfieldwork.models.mem

import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.models.HillfortStore

var lastId = 0L

internal fun getId(): Long {
  return lastId++
}

class HillfortMemStore : HillfortStore, AnkoLogger {

  val hillforts = ArrayList<HillfortModel>()

  override fun findAllHillforts(): List<HillfortModel> {
    return hillforts
  }

  override fun createHillfort(hillfort: HillfortModel) {
    hillfort.id = getId()
    hillforts.add(hillfort)
    logAll()
  }

  override fun updateHillfort(hillfort: HillfortModel) {
    var foundHillfort: HillfortModel? = hillforts.find { p -> p.id == hillfort.id }
    if (foundHillfort != null) {
      foundHillfort.name = hillfort.name
      foundHillfort.description = hillfort.description
      foundHillfort.image = hillfort.image
      foundHillfort.location = hillfort.location
      foundHillfort.date = hillfort.date
      foundHillfort.description = hillfort.description

      logAll();
    }
  }

  override fun deleteHillfort(placemark: HillfortModel) {
    hillforts.remove(placemark)
  }

  override fun findHillfortById(id:Long) : HillfortModel? {
    val foundPlacemark: HillfortModel? = hillforts.find { it.id == id }
    return foundPlacemark
  }

  fun logAll() {
    hillforts.forEach { info("${it}") }
  }

  override fun clear() {
    hillforts.clear()
  }
}