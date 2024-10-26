package com.example.a99group_mobileexercise_benedictokennethsubagio.detailPage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a99group_mobileexercise_benedictokennethsubagio.R

class DetailPage_Adapter(val dataDetailPage: ResponseDetailPage): RecyclerView.Adapter<DetailPage_Adapter.MyViewHolder>() {
    class MyViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val imgDetailPage = view.findViewById<ImageView>(R.id.imgDetailPage);
        val sv_2561 = view.findViewById<TextView>(R.id.sv_2561);
        val project_name = view.findViewById<TextView>(R.id.sv_project_name);
        val title_sv = view.findViewById<TextView>(R.id.title_sv);
        val subtitle_sv = view.findViewById<TextView>(R.id.subtitle_sv);
        val bed_rooms = view.findViewById<TextView>(R.id.sv_bedrooms);
        val bath_rooms = view.findViewById<TextView>(R.id.sv_bathrooms);
        val area_size = view.findViewById<TextView>(R.id.sv_area_size);
        val label_1450 = view.findViewById<TextView>(R.id.label_1450);
        val label_floor_level = view.findViewById<TextView>(R.id.label_floor_level);
        val label_furnishing = view.findViewById<TextView>(R.id.label_furnishing);
        val label_no_of_bed = view.findViewById<TextView>(R.id.label_no_of_bed);
        val label_facing = view.findViewById<TextView>(R.id.label_facing);
        val label_built_year = view.findViewById<TextView>(R.id.label_built_year);
        val label_tenure = view.findViewById<TextView>(R.id.label_tenure);
        val label_property_type = view.findViewById<TextView>(R.id.label_property_type);
        val label_last_updated = view.findViewById<TextView>(R.id.label_last_updated);
        val label_description = view.findViewById<TextView>(R.id.label_description);

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_page2,parent,false);
        return MyViewHolder(view);
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.sv_2561.text = String.format("%,d",dataDetailPage?.attributes?.price)
        holder.project_name.text = dataDetailPage?.projectName
        holder.title_sv.text = dataDetailPage?.address?.title
        holder.subtitle_sv.text = dataDetailPage?.address?.subtitle

        holder.bed_rooms.text = dataDetailPage?.attributes?.bedrooms.toString();
        holder.bath_rooms.text = dataDetailPage?.attributes?.bathrooms.toString();
        holder.area_size.text = String.format("%,d",dataDetailPage?.attributes?.areaSize)

        holder.label_1450.text = dataDetailPage?.propertyDetails?.get(position)?.text;
        holder.label_floor_level.text = dataDetailPage?.propertyDetails?.get(position)?.text;
        holder.label_no_of_bed.text = dataDetailPage?.propertyDetails?.get(position)?.text
        holder.label_facing.text = dataDetailPage?.propertyDetails?.get(position)?.text
        holder.label_built_year.text = dataDetailPage?.propertyDetails?.get(position)?.text
        holder.label_tenure.text = dataDetailPage?.propertyDetails?.get(position)?.text
        holder.label_property_type.text = dataDetailPage?.propertyDetails?.get(position)?.text
        holder.label_last_updated.text = dataDetailPage?.propertyDetails?.get(position)?.text

        Glide.with(holder.imgDetailPage)
            .load(dataDetailPage?.photo)
            .error(R.drawable.ic_launcher_background)
            .into(holder.imgDetailPage)

    }

    override fun getItemCount(): Int {
        if(dataDetailPage!=null){
            return 1
        }
        return 0
    }



}