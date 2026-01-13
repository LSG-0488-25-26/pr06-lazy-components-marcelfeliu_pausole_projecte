package com.example.marcelfeliu_pausole_projecte.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.marcelfeliu_pausole_projecte.R
import com.example.marcelfeliu_pausole_projecte.model.RMCharacter
import com.example.marcelfeliu_pausole_projecte.viewmodel.RickAndMortyViewModel

@Composable
fun LazyColumnCharacters(navController: NavController, viewModel: RickAndMortyViewModel){
    val characterList by viewModel.characters.observeAsState(mutableListOf())

    LazyColumn(verticalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier
                .padding(vertical = 30.dp)
                .fillMaxHeight()
        ) {
        items(characterList){  char ->
            RMCharacterItem(char){
                viewModel.setCurrentCharacter(char)
                navController.navigate("DetailScreen")
            }
        }
    }
}