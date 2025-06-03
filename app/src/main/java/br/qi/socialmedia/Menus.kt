package br.qi.socialmedia

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.qi.socialmedia.ui.theme.SocialmediaTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar(
    title: String = "Título",
    modifier: Modifier = Modifier
) {
    TopAppBar(
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.error
        ),
        title = {
            Text( text = title)
        },
        actions = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Outlined.MoreVert,
                    contentDescription =  "Ícone de menu"
                )
            }//fim da icon
        },

        )
}

@Composable
fun MyBottomBar(
    navController: NavController,
    item: Int = -1,
    color: Color = Color.Black,
    colorSelected: Color = Color(103, 58, 183, 255),
    size: Dp = 26.dp,
    sizeSelected: Dp = 40.dp,
    modifier: Modifier = Modifier
){
    var itemSelected by remember {
        mutableIntStateOf( item )
    }

    BottomAppBar(
        containerColor = Color.Magenta
    ) {
        Row (
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = modifier.fillMaxWidth()
        ) {
            IconButton(
                onClick = {
                    itemSelected = item
                    navController.navigate(Rotas.Feed)
                }
            ) {
                Icon(
                    imageVector = Icons.Outlined.Home,
                    contentDescription =  "Ícone de Home",
                    tint = if(itemSelected == 0) colorSelected else color,
                    modifier = modifier.size(if (itemSelected == 0) sizeSelected else size)
                )
            }
            IconButton(
                onClick = {
                    itemSelected = item
                    navController.navigate(Rotas.Profile)
                }

            ) {
                Icon(
                    imageVector = Icons.Outlined.Person,
                    contentDescription =  "Ícone de perfil",
                    tint = if(itemSelected == 1) colorSelected else color,
                    modifier = modifier.size(if (itemSelected == 1) sizeSelected else size)
                )
            }//fim da icon 1
            IconButton(
                onClick = {
                    itemSelected = item
                    navController.navigate(Rotas.AddPost)
                }
            ) {
                Icon(
                    imageVector = Icons.Outlined.AddCircle,
                    contentDescription =  "Ícone de adicionar",
                    tint = if(itemSelected == 2) colorSelected else color,
                    modifier = modifier.size(if (itemSelected == 2) sizeSelected else size)
                )
            }//fim da icon 2
            IconButton(
                onClick = {
                    itemSelected = item
                    navController.navigate(Rotas.Config)
                }

            ) {
                Icon(
                    imageVector = Icons.Outlined.Settings,
                    contentDescription =  "Ícone de config",
                    tint = if(itemSelected == 3) colorSelected else color,
                    modifier = modifier.size(if (itemSelected == 3) sizeSelected else size)
                )
            }//fim da icon 3
        }//fim da row
    }//fim da bottom
}//fim do mybottom(meu butão? lá ele kakakaka vou me matar)


///////////////////////////////////////////////////////////////////////////////////////////////////
@Preview (showBackground = true)
@Composable
fun MyTopBarPreview(){
    SocialmediaTheme {
        //MyTopBar(title = "Teste")
    }
}

@Preview (showBackground = true)
@Composable
fun MyBottomBarPreview(){
    SocialmediaTheme {
        //MyBottomBar()
    }
}
