package org.wit.archaeologicalfieldwork.models

interface HillfortStore {
    fun findHillfortById(id: Long) : HillfortModel?
    fun findAllHillforts():List<HillfortModel>
    fun createHillfort(hillfort:HillfortModel)
    fun updateHillfort(hillfort: HillfortModel)
    fun deleteHillfort(hillfort: HillfortModel)
    fun clear()
}