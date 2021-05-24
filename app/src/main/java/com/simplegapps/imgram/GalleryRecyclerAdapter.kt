package com.simplegapps.imgram

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.simplegapps.imgram.databinding.GalleryItemBinding

class GalleryRecyclerAdapter : RecyclerView.Adapter<GalleryViewHolder>() {

    var imageList: List<Image> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder =
        GalleryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            .run {
                GalleryViewHolder(this)
            }


    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val image: Image = imageList[position]
        holder.bind(image)
    }

    override fun getItemCount(): Int = imageList.size

}

data class GalleryViewHolder(val binding: GalleryItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(image: Image) {
        binding.textView.text = image.url
    }

}