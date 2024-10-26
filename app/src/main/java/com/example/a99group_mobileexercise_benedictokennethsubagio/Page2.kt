package com.example.a99group_mobileexercise_benedictokennethsubagio

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.StructuredName
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ScrollingView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.a99group_mobileexercise_benedictokennethsubagio.detailPage.API_DetailPage.ApiConfig_Detail
import com.example.a99group_mobileexercise_benedictokennethsubagio.detailPage.DetailPage_Adapter
import com.example.a99group_mobileexercise_benedictokennethsubagio.detailPage.ResponseDetailPage
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response




class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page2)
        findViewById<ImageView>(R.id.back_btn).setOnClickListener {
            finish()
        }

        val page = findViewById<ScrollView>(R.id.sv_detailsPage)
        ApiConfig_Detail.getService().getDetail().enqueue(object : Callback<ResponseDetailPage>{
            override fun onResponse(call: Call<ResponseDetailPage>, response: Response<ResponseDetailPage>) {
                if(response.isSuccessful){
                    val responseDetailPage = response.body()
                    val dataDetail = responseDetailPage?.propertyDetails
                    val imgDetailPage = findViewById<ImageView>(R.id.imgDetailPage);
                    val sv_2561 =findViewById<TextView>(R.id.sv_2561);
                    val project_name = findViewById<TextView>(R.id.sv_project_name);
                    val title_sv = findViewById<TextView>(R.id.title_sv);
                    val subtitle_sv = findViewById<TextView>(R.id.subtitle_sv);
                    val bed_rooms = findViewById<TextView>(R.id.sv_bedrooms);
                    val bath_rooms = findViewById<TextView>(R.id.sv_bathrooms);
                    val area_size = findViewById<TextView>(R.id.sv_area_size);
                    val label_1450 = findViewById<TextView>(R.id.label_1450);
                    val label_floor_level = findViewById<TextView>(R.id.label_floor_level);
//                    val label_furnishing = findViewById<TextView>(R.id.label_furnishing);
                    val label_no_of_bed = findViewById<TextView>(R.id.label_no_of_bed);
                    val label_facing = findViewById<TextView>(R.id.label_facing);
                    val label_built_year = findViewById<TextView>(R.id.label_built_year);
                    val label_tenure = findViewById<TextView>(R.id.label_tenure);
                    val label_property_type = findViewById<TextView>(R.id.label_property_type);
                    val label_last_updated = findViewById<TextView>(R.id.label_last_updated);
                    val label_description = findViewById<TextView>(R.id.label_description);

                    sv_2561.text = String.format("%,d",responseDetailPage?.attributes?.price)
                    Glide.with(imgDetailPage)
                        .load(responseDetailPage?.photo)
                        .error(R.drawable.ic_launcher_background)
                        .into(imgDetailPage)

                    project_name.text = responseDetailPage?.projectName
                    title_sv.text = responseDetailPage?.address?.title
                    subtitle_sv.text = responseDetailPage?.address?.subtitle
                    bed_rooms.text = responseDetailPage?.attributes?.bedrooms.toString();
                    bath_rooms.text = responseDetailPage?.attributes?.bathrooms.toString();
                    area_size.text = String.format("%,d",responseDetailPage?.attributes?.areaSize)
                    label_1450.text = responseDetailPage?.propertyDetails?.get(0)?.text
                    label_floor_level.text = responseDetailPage?.propertyDetails?.get(1)?.text
                    label_no_of_bed.text = responseDetailPage?.propertyDetails?.get(2)?.text
                    label_facing.text = responseDetailPage?.propertyDetails?.get(3)?.text
                    label_built_year.text = responseDetailPage?.propertyDetails?.get(4)?.text
                    label_tenure.text = responseDetailPage?.propertyDetails?.get(5)?.text
                    label_property_type.text = responseDetailPage?.propertyDetails?.get(6)?.text
                    label_last_updated.text = responseDetailPage?.propertyDetails?.get(7)?.text
                    label_description.text = responseDetailPage?.description





                }
            }

            override fun onFailure(call: Call<ResponseDetailPage>, t: Throwable) {
                Toast.makeText(applicationContext,t.localizedMessage, Toast.LENGTH_SHORT).show()
            }

        })
    }
}