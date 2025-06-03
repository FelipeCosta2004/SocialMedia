package br.qi.socialmedia.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.qi.socialmedia.MyBottomBar
import br.qi.socialmedia.MyButton
import br.qi.socialmedia.MyTopBar
import br.qi.socialmedia.Rotas

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    navController: NavController,
    modifier: Modifier = Modifier
){
    Scaffold(
        topBar = { MyTopBar(
            title = "Seu Perfil"
        ) },
        bottomBar = { MyBottomBar(navController, item = 1) },
        containerColor = Color(103, 58, 183, 255)
    ) {
        Box(
            modifier = modifier.padding(it)
        ) {
            Text(text = "tela de Perfil")
        }
    }
}