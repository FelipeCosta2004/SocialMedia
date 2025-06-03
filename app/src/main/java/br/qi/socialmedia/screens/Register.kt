package br.qi.socialmedia.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.qi.socialmedia.DatePickerExamples
import br.qi.socialmedia.MyButton
import br.qi.socialmedia.MyTextField
import br.qi.socialmedia.MyTopBar
import br.qi.socialmedia.Rotas
import br.qi.socialmedia.ui.theme.SocialmediaTheme

@Composable
fun RegisterScreen(
    navController: NavController,
    modifier: Modifier = Modifier
){
    Column (
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MyTopBar(
            title = "Cadastro"
        )
        MyTextField(
            label = "Nome",
            isPassword = false,
            icon = Icons.Outlined.AccountCircle
        )
        MyTextField(
            label = "Email",
            isPassword = false,
            icon = Icons.Outlined.MailOutline
        )
        MyTextField(
            label = "Telefone",
            isPassword = false,
            icon = Icons.Outlined.Phone
        )
        DatePickerExamples()
        MyTextField(
            label = "Senha",
            isPassword = true,
            icon = Icons.Outlined.Lock
        )
        MyButton(
            label = "Cadastrar",
            size = 500.dp,
            action = { navController.navigate(Rotas.Login) }
        )
    }
}

//////////////////////////////////////////////////////////
@Preview(
    showBackground = true,
    widthDp = 320,
    heightDp = 620
)
@Composable
fun RegisterScreenPreview(){
    SocialmediaTheme {
        //RegisterScreen()
    }
}