package com.gym0fc0d3s

import io.ktor.server.engine.*
import io.ktor.server.tomcat.*
import com.gym0fc0d3s.plugins.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun main() {
    embeddedServer(Tomcat, port = 8080, host = "192.168.43.55") {
        configureRouting()
        configureTemplating()
//        configureSecurity()
//        configureSockets()

        //custom modules
        cyclesRouting()

    }.start(wait = true)
}
