package com.example.marcelfeliu_pausole_projecte.model

import androidx.annotation.DrawableRes

data class Character(
    var name: String,
    var type: String,
    @DrawableRes var image: Int
)