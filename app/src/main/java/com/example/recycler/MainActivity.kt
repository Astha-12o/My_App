package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.MyAdapter
import com.example.recycler.R
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    private var layoutManager:RecyclerView.LayoutManager?=null
    private var adapter:RecyclerView.Adapter<MyAdapter.MyViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = layoutManager

        adapter = MyAdapter()
        recyclerView.adapter = adapter
    }





}