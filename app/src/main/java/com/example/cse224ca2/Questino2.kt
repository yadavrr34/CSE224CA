package com.example.cse224ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Questino2 : AppCompatActivity() {
    lateinit var radioButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questino2)
        val grp=findViewById<RadioGroup>(R.id.grp)
        val btn=findViewById<Button>(R.id.button3)
        btn.setOnClickListener {
            Toast.makeText(applicationContext,"Hostel Booked",Toast.LENGTH_SHORT).show()
        }

        grp.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(
                    applicationContext, " On checked change : ${radio.text}",
                    Toast.LENGTH_SHORT
                ).show()
                // radio.setTextColor(Color.parseColor("#fe9c02"))
            }
        )

    }
    fun itemClicked(v: View) {
        //code to check if this checkbox is checked!
        val checkBox = v as CheckBox
        if (checkBox.isChecked) {
            Toast.makeText(applicationContext,v.text,Toast.LENGTH_SHORT).show()

        }
    }
}