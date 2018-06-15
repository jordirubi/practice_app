package com.example.jordi.practice_app.navigator

import android.content.Context
import android.content.Intent
import com.example.jordi.practice_app.view.activity.home.HomeActivity

fun navigateToHomeActivity(context: Context) {
    val intent = Intent(context, HomeActivity::class.java)
    context.startActivity(intent)
}

fun navigateToProfileActivity(context: Context) {
    val intent = Intent(context, HomeActivity::class.java)
    context.startActivity(intent)
}

fun navigateToCatchedActivity(context: Context) {
    val intent = Intent(context, HomeActivity::class.java)
    context.startActivity(intent)
}

fun navigateToSettingsActivity(context: Context) {
    val intent = Intent(context, HomeActivity::class.java)
    context.startActivity(intent)
}