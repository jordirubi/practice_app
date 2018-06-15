package com.example.jordi.practice_app.model

import com.example.jordi.domain.constants.Civil_state
import com.example.jordi.domain.constants.Sex

data class PersonView(val name: String,
                      val birth_year: Int,
                      val sex: Sex?,
                      val photo_path: String?,
                      val civil_state: Civil_state?,
                      val description: String?)
