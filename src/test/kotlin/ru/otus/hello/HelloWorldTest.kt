package ru.otus.hello

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class HelloWorldTest: StringSpec() {
    init {
        "Simple test" {
            0 shouldBe 0
        }
    }
}