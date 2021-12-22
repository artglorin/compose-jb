/*
 * Copyright 2020-2021 JetBrains s.r.o. and respective authors and developers.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE.txt file.
 */

package org.jetbrains.compose.web.skiko

import org.jetbrains.compose.web.dom.ElementScope
import org.w3c.dom.HTMLCanvasElement
import org.jetbrains.skiko.wasm.onWasmReady

fun ElementScope<HTMLCanvasElement>.ping() {
    onWasmReady {
        println("PONG!!!")
    }
}