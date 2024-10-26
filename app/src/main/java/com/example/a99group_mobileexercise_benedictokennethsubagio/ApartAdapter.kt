package com.example.a99group_mobileexercise_benedictokennethsubagio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ApartAdapter(val dataGroup: List<Response99GroupItem>?, val listener: onItemClickListener): RecyclerView.Adapter<ApartAdapter.MyViewHolder>() {
    interface onItemClickListener{
        fun onItemClick(position: Int)
    }




    class MyViewHolder (view: View,val listener: onItemClickListener) : RecyclerView.ViewHolder(view),View.OnClickListener{
        val imgApart = view.findViewById<ImageView>(R.id.item_image_apart)
        val nameApart = view.findViewById<TextView>(R.id.item_project_name)
        val streetName = view.findViewById<TextView>(R.id.item_street_name)
        val districtName = view.findViewById<TextView>(R.id.item_district_name)
        val condoName = view.findViewById<TextView>(R.id.item_category_name)
        val tahunCompleted = view.findViewById<TextView>(R.id.item_completed_at)
        val tenureName = view.findViewById<TextView>(R.id.item_tenure_name)
        val areaSizeName = view.findViewById<TextView>(R.id.item_area_size_name)
        val bathroomsName = view.findViewById<TextView>(R.id.item_bathrooms_name)
        val bedroomsName = view.findViewById<TextView>(R.id.item_bedrooms_name)
        val priceName = view.findViewById<TextView>(R.id.item_prize_name)

        init {
            itemView.setOnClickListener(this)
        }
        override fun onClick(p0: View?) {
            val position = adapterPosition
            if(position!=RecyclerView.NO_POSITION){
                listener.onItemClick(position)

            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_search,parent,false)
        return MyViewHolder(view, listener)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nameApart.text = dataGroup?.get(position)?.projectName

        holder.streetName.text = dataGroup?.get(position)?.address?.streetName
        holder.districtName.text = dataGroup?.get(position)?.address?.district

        holder.condoName.text = dataGroup?.get(position)?.category
        holder.tahunCompleted.text = dataGroup?.get(position)?.completedAt
        holder.tenureName.text = dataGroup?.get(position)?.tenure.toString()

        holder.areaSizeName.text = String.format("%,d",dataGroup?.get(position)?.attributes?.areaSize)
        holder.bathroomsName.text = dataGroup?.get(position)?.attributes?.bathrooms.toString()
        holder.bedroomsName.text = dataGroup?.get(position)?.attributes?.bedrooms.toString()
        holder.priceName.text = String.format("%,d",dataGroup?.get(position)?.attributes?.price)

        Glide.with(holder.imgApart)
            .load(dataGroup?.get(position)?.photo)
            .error(R.drawable.ic_launcher_background)
            .into(holder.imgApart)
        //


    }


    override fun getItemCount(): Int {
        if(dataGroup != null){
            return dataGroup.size
        }
        return 0
    }


}