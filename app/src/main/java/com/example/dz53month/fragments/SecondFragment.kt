package com.example.dz53month.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dz53month.NamesAdapter
import com.example.dz53month.R


class SecondFragment : Fragment() {

    private val list: ArrayList<String> = ArrayList()
    private var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.rv_name)
        list.add("gxysyxgsy")
        list.add("xkksksksk")
        list.add("njndsjbj")
        list.add("xsmkxmsk")
        list.add("gxysyxgsy")
        list.add("xkksksksk")
        list.add("njndsjbj")
        list.add("xsmkxmsk")
        list.add("gxysyxgsy")
        list.add("xkksksksk")
        list.add("njndsjbj")
        list.add("xsmkxmsk")
        list.add("gxysyxgsy")
        list.add("ghiogo")
        list.add("njndsjbj")
        list.add("xsmkxmsk")

        val namesAdapter = NamesAdapter(listNames = list)
        recyclerView?.layoutManager= LinearLayoutManager (context, RecyclerView
            .VERTICAL, false)
        recyclerView?.adapter = namesAdapter
    }

}