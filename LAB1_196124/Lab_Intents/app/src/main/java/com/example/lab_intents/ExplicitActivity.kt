package com.example.lab_intents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class ExplicitActivity : AppCompatActivity() {
    private lateinit var btnOk: Button
    private lateinit var btnBack: Button
    private lateinit var evMainText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.explicit_activity)
        evMainText = findViewById(R.id.evMainText)
        btnOk = findViewById(R.id.btnOk)
        btnBack = findViewById(R.id.btnBack)

        btnBack.setOnClickListener {
            this.finish()
        }

        btnOk.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("text",evMainText.text.toString())
            setResult(RESULT_OK, resultIntent)
            this.finish()
        }

    }
}