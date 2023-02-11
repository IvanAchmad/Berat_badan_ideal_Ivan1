package com.example.beratbadanidealivan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var etTinggi : EditText
    private lateinit var hasil : TextView
    private lateinit var rblakilaki : RadioButton
    private lateinit var rbPerempuan : RadioButton
    private lateinit var BTNproses : Button

    private var tb : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        etTinggi = findViewById(R.id.etTinggi)
        hasil = findViewById(R.id.hasil)
        rblakilaki = findViewById(R.id.rblakilaki)
        rbPerempuan = findViewById(R.id.rbPerempuan)
        BTNproses = findViewById(R.id.BTNproses)

        BTNproses.setOnClickListener {
            var tinggi = etTinggi.text.toString().toInt()

            if (rblakilaki.isChecked){
                tb = (tinggi - 100)-((tinggi - 100) * 10/100)
                hasil.setText(tb.toString()+ "kg")

            }else{
                tb = (tinggi - 100)- ((tinggi - 100) * 15/100)
                hasil.setText(tb.toString()+ "kg")
            }
        }

    }
}