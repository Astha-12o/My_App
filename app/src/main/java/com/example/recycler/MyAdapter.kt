package com.example.recycler

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private var title= arrayOf("Wake Up, be Awesome and always believe in yourself","In order to bloom you must grow","The best is yet to come","Life is like riding a bicycle,To keep your balance,you must keep moving","Wake Up, be Awesome and always believe in yourself")
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




