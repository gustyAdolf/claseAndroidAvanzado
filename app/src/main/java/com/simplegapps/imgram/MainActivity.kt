package com.simplegapps.imgram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simplegapps.imgram.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Se puede usar run pero devuelve void en este caso
        // Usamos also para ello
        val binding = MainActivityBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        val adapter = GalleryRecyclerAdapter()
        binding.galleryRecyclerView.adapter = adapter

        adapter.imageList = listOf(Image("url"))

    }
}