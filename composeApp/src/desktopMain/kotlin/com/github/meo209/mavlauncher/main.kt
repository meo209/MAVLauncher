package com.github.meo209.mavlauncher

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MAVLauncher",
    ) {
        App()
    }
}