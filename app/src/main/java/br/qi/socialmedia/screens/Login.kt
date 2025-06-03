package br.qi.socialmedia.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.qi.socialmedia.LogoLogin
import br.qi.socialmedia.MyButton
import br.qi.socialmedia.MySwitchState
import br.qi.socialmedia.MyTextField
import br.qi.socialmedia.R
import br.qi.socialmedia.Rotas
import br.qi.socialmedia.ui.theme.SocialmediaTheme

@Composable
fun LoginScreen(
    navController: NavController,
    modifier: Modifier = Modifier
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        LogoLogin(
            logo = R.drawable.ic_launcher_foreground
        )

        MyTextField(
            label = "usuário",
            isPassword = false,
            icon = Icons.Outlined.AccountCircle
        )

        MyTextField(
            label = "Senha",
            isPassword = true,
            icon = Icons.Outlined.Lock
        )

        MySwitchState(
            label = "Mantenha-me conectado",
        )

        MyButton(
            label = "Entrar",
            size = 300.dp,
            action = { navController.navigate(Rotas.Feed) }
        )

        MyButton(
            label = "Registrar",
            size = 300.dp,
            action = { navController.navigate(Rotas.Register) }
        )
    }//fim da column
}

////////////////////////////////////////////////////

@Preview(
    showBackground = true,
    widthDp = 320,
    heightDp = 620
)
@Composable
fun MyLoginPreview() {
    SocialmediaTheme {
        //LoginScreen()
    }
}