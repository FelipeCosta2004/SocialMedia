package br.qi.socialmedia

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Clear
import androidx.compose.material.icons.outlined.Done
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import br.qi.socialmedia.ui.theme.SocialmediaTheme

@Composable
fun LogoLogin(
    @DrawableRes logo: Int,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = logo),
        contentDescription = "Logotipo da tela de login",
        modifier = Modifier.height(150.dp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField(
    label: String,
    isPassword: Boolean,
    icon: ImageVector,
    modifier: Modifier = Modifier
) {
    var textValue by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var hidePass by remember {
        mutableStateOf(true)
    }

    TextField(
        value = textValue,
        onValueChange = { textValue = it },
        label = {
            Text(text = label)
        },
        leadingIcon = {
            Icon(
                imageVector = icon,
                contentDescription = "icone da caixa de texto"
            )
        },
        trailingIcon = {
            if(isPassword) {
                IconButton(
                    onClick = { hidePass = !hidePass}
                ) {
                    Icon(
                        imageVector = if(hidePass) Icons.Outlined.Done else Icons.Outlined.Clear,
                        contentDescription = "icone para esconder a senha"
                    )
                }
            } else {
                hidePass = false
            }
        },
        visualTransformation = if(hidePass) PasswordVisualTransformation('*') else VisualTransformation.None
    )//fim do textfield
}

@Composable
fun MySwitch (
    label: String,
    isChecked: Boolean,
    onChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Row (
        verticalAlignment = Alignment.CenterVertically
    ) {
        Switch(
            checked = isChecked,
            onCheckedChange = onChange
        )

        Spacer(
            modifier = modifier.width(5.dp)
        )

        Text(
            text = label
        )
    }//fim da Row
}//fim do MySwitch

@Composable
fun MySwitchState(
    label: String,
    modifier: Modifier = Modifier
){
    var checkChange by remember {
        mutableStateOf(false)
    }

    MySwitch(
        isChecked = checkChange,
        onChange = {checkChange = !checkChange},
        label = label
    )

}//fim do MySwitchState

@Composable
fun MyButton(
    label: String,
    action: () -> Unit = {},
    size: Dp,
    modifier: Modifier = Modifier
){
    Box(
        modifier = modifier.width(size)
    ) {
        ElevatedButton(
            onClick = action,
            modifier = modifier.fillMaxWidth()
        ) {
            Text(
                text = label
            )
        }
    }
}



////////////////////////////////////////////////////////////////////////////////////////////////////
@Preview
@Composable
fun MyTextFieldPreview() {
    SocialmediaTheme {
        MyTextField(
            label = "Senha",
            isPassword = true,
            icon = Icons.Outlined.Lock
        )
    }
}

@Preview
@Composable
fun MyComposablePreview() {
    Column {
        MySwitchState(label = "Texto Qualquer")
        MyButton(label = "suicide", size = 200.dp)
    }
}