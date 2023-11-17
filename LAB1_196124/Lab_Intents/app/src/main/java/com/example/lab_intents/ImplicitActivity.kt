package com.example.lab_intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ImplicitActivity : AppCompatActivity() {

    private lateinit var tvMain: TextView
    private lateinit var btnBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit)
        tvMain = findViewById(R.id.tvMain)
        btnBack = findViewById(R.id.buttonBack)


        val mainIntent = Intent(Intent.ACTION_MAIN, null)
        mainIntent.addCategory(Intent.CATEGORY_LAUNCHER)

        val resolveInfoList = packageManager.queryIntentActivities(mainIntent, 0)

        var value = ""
        for (resolveInfo in resolveInfoList) {
            val activityInfo = resolveInfo.activityInfo
            val className = activityInfo.name
            value += ("$className\n")
        }

        tvMain.text = value

        btnBack.setOnClickListener {_ ->
            val resultIntent = Intent()
            resultIntent.putExtra("text",tvMain.text.toString())
            setResult(RESULT_OK, resultIntent)
            this.finish()
        }
    }
}