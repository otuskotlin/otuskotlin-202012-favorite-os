package ru.otus.favorites.multiplatform.shared

import kotlin.jvm.JvmOverloads

data class User @JvmOverloads constructor(
    val id: String = "",
    val name: String = ""
)
