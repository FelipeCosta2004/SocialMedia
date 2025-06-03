package br.qi.socialmedia

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.qi.socialmedia.model.PostData
import br.qi.socialmedia.ui.theme.SocialmediaTheme

@Composable
fun ListPost(
    list: List<PostData> = listagem,
    modifier: Modifier = Modifier
){
    LazyColumn {
        items(list) {
            Surface(
                modifier = modifier.padding(8.dp)
            ) {
                PostPage(
                    imageProfile = it.imageProfile,
                    nameProfile = it.nameProfile,
                    timeProfile = it.timeProfile,
                    imagePost = it.imagePost,
                    textPost = it.textPost
                )
            }
        }
    }
}

//////////////////////////////////////////////
@Preview(
    showBackground = true,
    heightDp = 450
)
@Composable
fun ListPostPreview(){
    SocialmediaTheme {
        ListPost()
    }
}


////////////////////////////////////////////
val listagem = listOf(
    PostData(
        imageProfile = R.drawable.kikada,
        nameProfile = "Kiko",
        timeProfile = "5 minutos atrás",
        imagePost = R.drawable.kiko,
        textPost = "Você não vai com a minha cara?"
    ),//postdata 1

    PostData(
        imageProfile = R.drawable.jaiminhoum,
        nameProfile = "Jaiminho Carteiro",
        timeProfile = "15 minutos atrás",
        imagePost = R.drawable.jaiminhodois,
        textPost = "É que eu quero evitar a fadiga..."
    ),//postdata 2

    PostData(
        imageProfile = R.drawable.florindabrava,
        nameProfile = "dona florinda",
        timeProfile = "2 minutos atrás",
        imagePost = R.drawable.florinda,
        textPost = "aceita tomar uma xicara de cafe ☕"
    ),//postdata 3

    PostData(
        imageProfile = R.drawable.madruga,
        nameProfile = "Seu Madruga",
        timeProfile = "5 dias atrás",
        imagePost = R.drawable.madrugapensante,
        textPost = "A vingança nunca é plena mata a alma e a envenena"
    ),//postdata 4

    PostData(
        imageProfile = R.drawable.chaves,
        nameProfile = "Chaves",
        timeProfile = "Agora",
        imagePost = R.drawable.chavesmtoreal,
        textPost = "Ai que burro dá zero pra ele"
    ),//postdata 5

    PostData(
        imageProfile = R.drawable.chapolin,
        nameProfile = "Chapolin",
        timeProfile = "1 mês atrás",
        imagePost = R.drawable.chapolinfortnite,
        textPost = "Sigam-me os bons"
    ),//postdata 6

    PostData(
        imageProfile = R.drawable.girafa,
        nameProfile = "Professor Girafales",
        timeProfile = "35 minutos atrás",
        imagePost = R.drawable.girafata,
        textPost = "Tá Tá Tá Tá Tá!!!!"
    ),//postdata 7

    PostData(
        imageProfile = R.drawable.popis,
        nameProfile = "Popis",
        timeProfile = "5 segundos atrás",
        imagePost = R.drawable.popispo,
        textPost = "Não me lembro de nenhuma frase dela, também não achei, me desculpe"
    ),//postdata 8

    PostData(
        imageProfile = R.drawable.chica,
        nameProfile = "Chiquinha",
        timeProfile = "25 minutos atrás",
        imagePost = R.drawable.chiquinha,
        textPost = "O que você tem de burro, você tem de burro!"
    ),//postdata 9

    PostData(
        imageProfile = R.drawable.nhonho,
        nameProfile = "Nhonho ou Ñoño",
        timeProfile = "1 ano atrás",
        imagePost = R.drawable.nhonhojumpscare,
        textPost = "Ai Chavinho!!"
    ),//postdata 10
    
)//fim da lista