package com.gym0fc0d3s.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.locations.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.cyclesRouting() {

    routing {



        get("/Cycles"){
            call.respond("We Count your Cycles Here!!")
        }
    }


}

