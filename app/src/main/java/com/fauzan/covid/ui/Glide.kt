package com.fauzan.covid.ui

import android.widget.ImageView
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule

@GlideModule
class GlideLoad : AppGlideModule() {}

fun ImageView.loadImage(img: Int){
    GlideApp.with(this.context)
        .load(img)
        .into(this)
}