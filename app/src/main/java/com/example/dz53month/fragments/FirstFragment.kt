package com.example.dz53month.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.dz53month.R


class FirstFragment : Fragment() {
    private lateinit var ed_password: EditText
    private lateinit var button: Button
    private lateinit var admin: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ed_password = view.findViewById(R.id.ed_password)
        button = view.findViewById(R.id.button)

        click()
    }

    private fun click() {
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val password: String = ed_password.text.toString().trim()
                if (!password.equals("admin")) {
                    ed_password.setError("Неправильный пароль")
                } else {
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, SecondFragment())
                        .addToBackStack("FirstFragment")
                        .commit()
                }
            }

        })
    }

}