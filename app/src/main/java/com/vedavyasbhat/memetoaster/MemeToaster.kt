package com.vedavyasbhat.memetoaster

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MemeToaster(private val context: Context) {
    fun fuuu(text: String? = null) {
        toast(Memes.Images.Fuuu)
    }

    fun trollFace(text: String? = null) {
        toast(Memes.Images.TrollFace, text)
    }

    fun awwYeah(text: String? = null) {
        toast(Memes.Images.AwwYeah, text)
    }

    private fun toast(
            name: String,
            text: String? = null,
            width: Int = Dimensions.Medium,
            height: Int = Dimensions.Medium) {
        Toast(context).apply {
            view = LayoutInflater.from(context).inflate(R.layout.toast, null)
            (view.findViewById<View>(R.id.image) as ImageView).apply {
                this.setImageResource(Memes.Images.resource(name))
                this.layoutParams.width = width
                this.layoutParams.height = height
            }
            (view.findViewById<View>(R.id.text) as TextView).apply {
                this.text = text
            }
            show()
        }
    }
}