package br.qi.socialmedia.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import br.qi.socialmedia.MyBottomBar
import br.qi.socialmedia.MyTopBar


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConfigScreen(
    navController: NavController,
    modifier: Modifier = Modifier
){
    Scaffold(
        topBar = { MyTopBar(
            title = "Configuração"
        ) },
        bottomBar = { MyBottomBar(navController, item = 3) },
        containerColor = Color(103, 58, 183, 255)
    ) {
        Box(
            modifier = modifier.padding(it)
        ) {
            Text(text = "tela de Configuração")
        }
    }
}