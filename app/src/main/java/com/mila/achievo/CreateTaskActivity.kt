package com.mila.achievo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class CreateTaskActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etTitle: EditText
    private lateinit var etDesc: EditText
    private lateinit var etLevel: EditText
    private lateinit var etCategory: EditText
    private lateinit var etDeadline: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_task)

        etTitle = findViewById(R.id.edt_title)
        etDesc = findViewById(R.id.edt_desc)
        etLevel = findViewById(R.id.edt_level)
        etCategory = findViewById(R.id.edt_category)
        etDeadline = findViewById(R.id.edt_deadline)

        val btnCreate: Button = findViewById(R.id.btn_create)
        btnCreate.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_create -> {

                val bundle = Bundle()
                bundle.putString("title", etTitle.text.toString())
                bundle.putString("desc", etDesc.text.toString())
                bundle.putString("level", etLevel.text.toString())
                bundle.putString("category", etCategory.text.toString())
                bundle.putString("deadline", etDeadline.text.toString())

                val intent = Intent(this@CreateTaskActivity, MainActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}