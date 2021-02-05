package ru.otus.favorites.multiplatform.shared

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.test.Test
import kotlin.test.assertEquals

class ClientTest {
    @Test
    fun jsTest() {

        val client = Client()
        GlobalScope.launch {
            val response = client.sendRequest()
            assertEquals(response, "Response")
        }
    }
}