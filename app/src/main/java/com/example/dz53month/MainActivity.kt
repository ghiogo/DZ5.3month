package com.example.dz53month

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dz53month.fragments.FirstFragment
import com.example.dz53month.fragments.SecondFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
            .add(R.id.fragment_container, FirstFragment())
            .commit()
    }
}