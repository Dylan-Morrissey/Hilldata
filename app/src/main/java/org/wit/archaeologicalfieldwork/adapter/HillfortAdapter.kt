package org.wit.archaeologicalfieldwork.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.card_hillfort.view.*
import org.wit.archaeologicalfieldwork.R
import org.wit.archaeologicalfieldwork.adapter.ImageAdapter
import org.wit.archaeologicalfieldwork.models.HillfortModel

interface HillfortListener {
    fun onHillfortClick(hillfort: HillfortModel)
}

class HillfortAdapter constructor(private var hillforts: List<HillfortModel>,
                                  private val listener: HillfortListener) : RecyclerView.Adapter<HillfortAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(LayoutInflater.from(parent.context).inflate(R.layout.card_hillfort, parent, false))
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val hillfort = hillforts[holder.adapterPosition]
        holder.bind(hillfort, listener)
    }

    override fun getItemCount(): Int = hillforts.size

    class MainHolder constructor(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(hillfort: HillfortModel, listener: HillfortListener){
            itemView.hillfortNameCard.text  = hillfort.name
            itemView.lnglatCard.text = "Longdiude: "+ hillfort.location.lng.toString() + "\nLatitude: " + hillfort.location.lat.toString()
            itemView.checkboxCard.setChecked(hillfort.visited)
            Glide.with(itemView.context).load(hillfort.image).into(itemView.imageIcon);
            itemView.setOnClickListener{listener.onHillfortClick(hillfort)}
        }
    }
}