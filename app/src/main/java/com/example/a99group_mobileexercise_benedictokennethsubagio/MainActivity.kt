package com.example.a99group_mobileexercise_benedictokennethsubagio

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a99group_mobileexercise_benedictokennethsubagio.API.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), ApartAdapter.onItemClickListener {
    private lateinit var apartAdapter: ApartAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val apart = findViewById<RecyclerView>(R.id.rv_morty)
        ApiConfig.getService().getApart().enqueue(object : Callback<List<Response99GroupItem>>{
            override fun onResponse(call: Call<List<Response99GroupItem>>, response: Response<List<Response99GroupItem>>) {
                if(response.isSuccessful){
                    val response99Group = response.body()
                    val dataGroup = response99Group
                    val apartAdapter = ApartAdapter(dataGroup,this@MainActivity)
                    apart.apply {
                        layoutManager = LinearLayoutManager(this@MainActivity)
                        setHasFixedSize(true)
                        apartAdapter.notifyDataSetChanged()
                        adapter = apartAdapter
                    }
                }
            }

            override fun onFailure(call: Call<List<Response99GroupItem>>, t: Throwable) {
                Toast.makeText(applicationContext,t.localizedMessage, Toast.LENGTH_LONG).show()
            }
        })
    }

    override fun onItemClick(position: Int) {
        val intent = Intent(this,Page2::class.java)
        startActivity( intent)
    }
}