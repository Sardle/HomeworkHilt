package com.example.homeworkhilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.example.homeworkhilt.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<ImageViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.apply {
            getImageUrl()
            livaData.observe(this@MainActivity) {
                Glide.with(this@MainActivity)
                    .load(it.imageUrl)
                    .into(findViewById(R.id.image))
            }
        }
    }
}