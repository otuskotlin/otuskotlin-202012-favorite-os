package ru.otus.favorites.multiplatform.shared

expect class Client {
    suspend fun sendRequest(): String
}