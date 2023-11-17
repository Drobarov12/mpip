package com.example.lab_intents

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    private lateinit var buttonExplicitActivity: Button
    private lateinit var buttonInplicitActivity: Button
    private lateinit var buttonSelectPhoto: Button
    private lateinit var textViewActivityResoult: TextView
    private lateinit var selectedImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        buttonExplicitActivity = findViewById(R.id.buttonExplicitActivity)
        buttonInplicitActivity = findViewById(R.id.buttonImplicitActivity)
        buttonSelectPhoto = findViewById(R.id.buttonSelectPhoto)
        textViewActivityResoult = findViewById(R.id.textViewActivityResoult)
        selectedImage = findViewById(R.id.imageView)

        buttonExplicitActivity.setOnClickListener {
            Intent(this, ExplicitActivity::class.java).let {i-> resultLauncher.launch(i)}
        }

        buttonInplicitActivity.setOnClickListener {_ ->
            Intent().apply {
                action = "mk.ukim.finki.mpip.IMPLICIT_ACTION"
                type = "text/plain"
            }.let { i ->
                resultLauncher.launch(i)
            }
        }

        buttonSelectPhoto.setOnClickListener {
            openGallery()
        }

    }

    var resultLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data: Intent? = result.data
                textViewActivityResoult.text =
                    data?.getStringExtra("text")
            }
        }


    private val pickImage: ActivityResultLauncher<Intent> =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data: Intent? = result.data
                if (data != null) {
                    val selectedImageUri: Uri? = data.data
                    selectedImage.setImageURI(selectedImageUri)
                }
            }
        }

    private fun openGallery() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        pickImage.launch(intent)
    }
}