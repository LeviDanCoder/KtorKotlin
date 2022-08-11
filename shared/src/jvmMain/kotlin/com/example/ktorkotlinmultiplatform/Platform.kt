package com.example.ktorkotlinmultiplatform

actual class Platform actual constructor() {
    actual val platform: String
        get() = "jvm"
}