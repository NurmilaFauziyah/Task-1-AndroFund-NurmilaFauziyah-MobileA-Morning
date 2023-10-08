package com.mila.achievo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etTitle: TextView
    private lateinit var etDesc: TextView
    private lateinit var etLevel: TextView
    private lateinit var etCategory: TextView
    private lateinit var etDeadline: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etTitle = findViewById(R.id.btn_title)
        etDesc = findViewById(R.id.btn_desc)
        etLevel = findViewById(R.id.btn_level)
        etCategory = findViewById(R.id.btn_category)
        etDeadline = findViewById(R.id.btn_deadline)

        val bundle = intent.extras
        if (bundle != null) {
            etTitle.setText(bundle.getString("title"))
            etDesc.setText(bundle.getString("desc"))
            etLevel.setText(bundle.getString("level"))
            etCategory.setText(bundle.getString("category"))
            etDeadline.setText(bundle.getString("deadline"))

        val btnFragment: Button = findViewById(R.id.btn_fragment)
        btnFragment.setOnClickListener(this)
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_fragment -> {
                val intent = Intent(this@MainActivity, CreateSuccess::class.java)
                startActivity(intent)
            }
        }
    }
}