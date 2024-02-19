package com.moiseeva.test.recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.moiseeva.test.R

class FeelRecycler(val context :  Context, val list : ArrayList<feel>):RecyclerView.Adapter<FeelRecycler.MyVH>() {

    class MyVH(itemView: View):RecyclerView.ViewHolder(itemView){
        val image:ImageView = itemView.findViewById(R.id.img_feel)
        val textView : TextView = itemView.findViewById(R.id.text_feel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeelRecycler.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.feel_adapter, parent, false)
        return MyVH(root)
    }

    override fun onBindViewHolder(holder: FeelRecycler.MyVH, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.textView.setText(list[position].text_feel)
    }

    override fun getItemCount(): Int  = list.size
}