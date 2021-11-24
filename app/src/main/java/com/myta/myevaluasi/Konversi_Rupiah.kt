package com.myta.myevaluasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_konversi__rupiah.*
import android.widget.EditText
import android.widget.TextView

class Konversi_Rupiah : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi__rupiah)

        supportActionBar?.title = "Konversi Rupiah"

        edtNilai = findViewById(R.id.edt_nilai)
        btnCalculate = findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_result)

        btnCalculate.setOnClickListener(this)
    }

    private lateinit var edtNilai: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate) {
            val inputNilai = edtNilai.text.toString().trim()

            var isEmptyFields = false
            if (inputNilai.isEmpty()) {
                isEmptyFields = true
                edtNilai.error = "Field ini tidak boleh kosong"
            }

            if (!isEmptyFields) {
                val konversi = inputNilai.toInt()/15000

                tvResult.text = ("Hasil Konversi $" + konversi.toString())


            }
        }
    }

}








