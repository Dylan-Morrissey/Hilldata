package org.wit.archaeologicalfieldwork.models.firebase

import android.content.Context
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import org.jetbrains.anko.AnkoLogger
import org.wit.archaeologicalfieldwork.models.HillfortModel
import org.wit.archaeologicalfieldwork.models.HillfortStore

class HillfortFireStore(val context: Context) : HillfortStore, AnkoLogger {

    val hillforts = ArrayList<HillfortModel>()
    lateinit var userId: String
    lateinit var db: DatabaseReference

    override fun findAllHillforts(): List<HillfortModel> {
        return hillforts
    }

    override fun findHillfortById(id: Long): HillfortModel? {
        val foundPlacemark: HillfortModel? = hillforts.find { p -> p.id == id }
        return foundPlacemark
    }

    override fun createHillfort(placemark: HillfortModel) {
        val key = db.child("users").child(userId).child("placemarks").push().key
        key?.let {
            placemark.fbId = key
            hillforts.add(placemark)
            db.child("users").child(userId).child("placemarks").child(key).setValue(placemark)
        }
    }

    override fun updateHillfort(placemark: HillfortModel) {
        var foundPlacemark: HillfortModel? = hillforts.find { p -> p.fbId == placemark.fbId }
        if (foundPlacemark != null) {
            foundPlacemark.name = placemark.name
            foundPlacemark.description = placemark.description
            foundPlacemark.image = placemark.image
            foundPlacemark.location = placemark.location
        }

        db.child("users").child(userId).child("placemarks").child(placemark.fbId).setValue(placemark)

    }

    override fun deleteHillfort(placemark: HillfortModel) {
        db.child("users").child(userId).child("placemarks").child(placemark.fbId).removeValue()
        hillforts.remove(placemark)
    }

    override fun clear() {
        hillforts.clear()
    }

    fun fetchHillforts(placemarksReady: () -> Unit) {
        val valueEventListener = object : ValueEventListener {
            override fun onCancelled(dataSnapshot: DatabaseError) {
            }
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                dataSnapshot!!.children.mapNotNullTo(hillforts) { it.getValue<HillfortModel>(HillfortModel::class.java) }
                placemarksReady()
            }
        }
        userId = FirebaseAuth.getInstance().currentUser!!.uid
        db = FirebaseDatabase.getInstance().reference
        hillforts.clear()
        db.child("users").child(userId).child("Hillforts").addListenerForSingleValueEvent(valueEventListener)
    }
}