package com.example.jordi.practice_app.extensions

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

/**
 * Extensions.
 */

/**
 * Context
 * */
fun Context.toast(text: String, length: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, text, length).show()
}

fun Context.toast(textId: Int, length: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, textId, length).show()
}

/**
 * ImageView
 * */
fun ImageView.load(src: String) {
    Glide.with(this.context)
            .load(src)
            .into(this)
}


/**
 * View
 * */
fun View.hideMe(gone: Boolean = true) {
    this.visibility = if (gone) View.GONE else View.INVISIBLE
}

fun View.showMe() {
    this.visibility = View.VISIBLE
}