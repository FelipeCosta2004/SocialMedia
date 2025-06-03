package br.qi.socialmedia.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.qi.socialmedia.ListPost
import br.qi.socialmedia.MyBottomBar
import br.qi.socialmedia.MyTopBar
import br.qi.socialmedia.ui.theme.SocialmediaTheme
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FeedScreen(
    navController: NavController,
    modifier: Modifier = Modifier
){
    Scaffold(
        topBar = { MyTopBar(
            title = "insta da vila"
        ) },
        bottomBar = { MyBottomBar(navController, item = 0) },
        containerColor = Color(103, 58, 183, 255)
    ) {
        Box(
            modifier = modifier.padding(it)
        ) {
            ListPost()
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////
@Preview(showBackground = true)
@Composable
fun FeedScreenPreview(){
    SocialmediaTheme {
        //FeedScreen()
    }
}