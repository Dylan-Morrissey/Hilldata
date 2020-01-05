package org.wit.archaeologicalfieldwork.models.room

import android.content.Context
import androidx.room.Room
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.models.HillfortStore
import org.wit.archaeologicalfieldwork.models.room.HillfortDao

class HillfortStoreRoom(val context: Context) : HillfortStore {
  override fun findHillfortName(name: String): ArrayList<HillfortModel> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun clearSearch() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun findSearchedHillforts(): List<HillfortModel> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  var dao: HillfortDao

  init {
    val database = Room.databaseBuilder(context, Database::class.java, "room_sample.db")
        .fallbackToDestructiveMigration()
        .build()
    dao = database.hillfortDao()
  }

  override fun findAllHillforts(): List<HillfortModel> {
    return dao.findAll()
  }

  override fun findHillfortById(id: Long): HillfortModel? {
    return dao.findById(id)
  }

  override fun createHillfort(placemark: HillfortModel) {
    dao.create(placemark)
  }

  override fun updateHillfort(placemark: HillfortModel) {
    dao.update(placemark)
  }

  override fun deleteHillfort(placemark: HillfortModel) {
    dao.deletePlacemark(placemark)
  }

  override fun clear() {
  }
}