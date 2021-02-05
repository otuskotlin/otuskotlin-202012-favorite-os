package ru.otus.favorites.multiplatform.shared

import kotlinx.coroutines.delay

actual class Client {
    actual suspend fun sendRequest(): String {
        delay(100)
        return "Response"
    }

}