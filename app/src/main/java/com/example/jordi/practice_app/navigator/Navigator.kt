package com.example.jordi.practice_app.navigator

import android.content.Context
import android.content.Intent
import com.example.jordi.practice_app.model.PersonView
import com.example.jordi.practice_app.view.activity.home.HomeActivity
import com.example.jordi.practice_app.view.activity.personProfile.PersonProfileActivity

fun navigateToHomeActivity(context: Context) {
    val intent = Intent(context, HomeActivity::class.java)
    context.startActivity(intent)
}

fun navigateToPersonActivity(context: Context, personView: PersonView) {
    val intent = Intent(context, PersonProfileActivity::class.java)
    intent.putExtra(PersonProfileActivity.PERSON_NAME_KEY, personView.name)
    intent.putExtra(PersonProfileActivity.BIRTH_AGE_KEY, personView.birth_year)
    intent.putExtra(PersonProfileActivity.SEX_KEY, personView.sex)
    intent.putExtra(PersonProfileActivity.PHOTO_PATH_KEY, personView.photo_path)
    intent.putExtra(PersonProfileActivity.CIVIL_STATE_KEY, personView.civil_state)
    intent.putExtra(PersonProfileActivity.DESCRIPTION_KEY, personView.description)

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