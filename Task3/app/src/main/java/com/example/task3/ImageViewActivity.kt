package com.example.task3

import android.graphics.Bitmap
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_image_view.*
import java.io.File

class ImageViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)

        textView.text = intent.getStringExtra("name")
        imageView.setImageURI(Uri.fromFile(File(intent.getStringExtra("path"))))
    }
}
