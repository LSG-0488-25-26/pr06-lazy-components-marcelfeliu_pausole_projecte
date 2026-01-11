package com.example.marcelfeliu_pausole_projecte.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.marcelfeliu_pausole_projecte.R
import com.example.marcelfeliu_pausole_projecte.model.Character


class RickAndMortyViewModel : ViewModel() {

    private val _characters = MutableLiveData<MutableList<Character>>(mutableListOf(
        Character("Rick Sanchez", "Alive", "Human", "Male", R.drawable.rick),
        Character("Morty Smith", "Alive", "Human", "Male", R.drawable.morty),
        Character("Summer Smith", "Alive", "Human", "Female", R.drawable.summer),
        Character("Beth Smith", "Alive", "Human", "Female", R.drawable.beth),
        Character("Jerry Smith", "Alive", "Human", "Male", R.drawable.jerry),
        Character("Abadango Cluster Princess", "Alive", "Alien", "Female", R.drawable.abadango),
        Character("Abradolf Lincler", "unknown", "Human", "Male", R.drawable.abradolf),
        Character("Adjudicator Rick", "Dead", "Human", "Male", R.drawable.adjudicator_rick),
    ))

    val characters: LiveData<MutableList<Character>> = _characters

    private val _currentCharacter = Character("", "", "", "", R.drawable.rick)
    val currentCharacter = _currentCharacter


}