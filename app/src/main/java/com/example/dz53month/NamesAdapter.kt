package com.example.dz53month

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NamesAdapter(private val listNames :ArrayList<String>):
RecyclerView.Adapter<NamesAdapter.NamesViewHolder>(){


    class NamesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
         private lateinit var name: TextView
        private val textView: TextView = itemView.findViewById(R.id.textView)
        fun onBind(neString: String) {
            textView.text = neString
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_names, parent, false)
        return NamesViewHolder(view)

    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.onBind(listNames[position])
    }

    override fun getItemCount(): Int {
     return listNames.size
    }

}