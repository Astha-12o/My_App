package com.example.recycler

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private var title= arrayOf("picture 1","picture 2","picture 3","picture 4","picture 5")
    private var Image= intArrayOf(R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic1)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.items,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.Image.setImageResource(Image[position])
        holder.title.text = title[position]

    }

    override fun getItemCount(): Int {
        return title.size
    }
    class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        var Image = itemView.findViewById<ImageView>(R.id.imagev)
        var title = itemView.findViewById<TextView>(R.id.textv)


    }
}




