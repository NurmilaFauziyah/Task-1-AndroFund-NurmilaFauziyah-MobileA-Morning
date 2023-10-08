package com.mila.achievo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.FragmentManager

class CreateSuccess : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_success)

        val fragmentManager:FragmentManager = supportFragmentManager
        val successFragment = SuccessFragment()
        val fragment = fragmentManager.findFragmentByTag(SuccessFragment::class.java.simpleName)

        if (fragment !is SuccessFragment) {
            fragmentManager
                .beginTransaction()
                .add(R.id.container, successFragment, SuccessFragment::class.java.simpleName)
                .commit()
        }
    }
}