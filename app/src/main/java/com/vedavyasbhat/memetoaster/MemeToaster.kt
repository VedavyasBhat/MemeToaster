package com.vedavyasbhat.memetoaster

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MemeToaster(private val context: Context) {

    fun apologetic(text: String? = null) = toast(Memes.Images.Apologetic, text)
    fun awwYeah(text: String? = null) = toast(Memes.Images.AwwYeah, text)
    fun fuuu(text: String? = null) = toast(Memes.Images.Fuuu, text)
    fun thumbsUp(text: String? = null) = toast(Memes.Images.ThumbsUp, text)
    fun trollFace(text: String? = null) = toast(Memes.Images.TrollFace, text)
    fun yUDoDis(text: String? = null) = toast(Memes.Images.YUDoDis, text)

    fun toastyMeme(ascii: String, textSize: Float = Dimensions.Text.Medium) {
        Toast(context).apply {
            view = TextView(context).apply {
                this.textSize = textSize
                this.text = ascii
            }

            show()
        }
    }

    private fun toast(
            name: String,
            text: String? = null,
            width: Int = Dimensions.Images.Medium,
            height: Int = Dimensions.Images.Medium) {
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