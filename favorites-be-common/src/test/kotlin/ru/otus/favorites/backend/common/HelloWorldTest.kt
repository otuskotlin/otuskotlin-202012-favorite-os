package ru.otus.favorites.backend.common

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class HelloWorldTest: StringSpec() {
    init {
        "Simple test" {
            0.toString() shouldBe "0"
        }
    }
}