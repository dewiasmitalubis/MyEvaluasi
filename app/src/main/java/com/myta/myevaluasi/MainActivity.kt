package com.myta.myevaluasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_konversi__rupiah.*
import android.widget.TextView
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnkonversiRupiah: Button = findViewById(R.id.btn_konversi_rupiah)
        btnkonversiRupiah.setOnClickListener(this)

        val btnkonversiSuhu: Button = findViewById(R.id.btn_konversi_suhu)
        btnkonversiSuhu.setOnClickListener(this)



    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_konversi_rupiah -> {
                val rupiahIntent = Intent(this@MainActivity, Konversi_Rupiah::class.java)
                startActivity(rupiahIntent)
            }
            R.id.btn_konversi_suhu -> {
                val suhuIntent = Intent(this@MainActivity, KonversiSuhu::class.java)
                startActivity(suhuIntent)

            }
        }
    }
}




