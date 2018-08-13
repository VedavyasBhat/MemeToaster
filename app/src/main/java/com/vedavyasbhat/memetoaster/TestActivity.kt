package com.vedavyasbhat.memetoaster

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val memeToaster = MemeToaster(this)

        //memeToaster.trollFace("Fek yuuu >|")

        memeToaster.toastyMeme(Memes.Ascii.TableFlip, 28F)
    }
}
