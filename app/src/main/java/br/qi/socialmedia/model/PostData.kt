package br.qi.socialmedia.model

import br.qi.socialmedia.R


data class PostData(
    var imageProfile: Int = R.drawable.ic_launcher_foreground,
    var nameProfile: String = "Nome do Perfil",
    var timeProfile: String = "Agora",
    var imagePost: Int = R.drawable.ic_launcher_background,
    var textPost: String = "Texto da postagem"
)
