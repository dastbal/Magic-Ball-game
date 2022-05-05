package com.example.plugins
import com.example.models.*

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import io.ktor.server.freemarker.*
import io.ktor.server.http.content.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.util.*

fun Application.configureRouting() {
    

    routing {
        get("/") {
            call.respondRedirect("Magic-Ball-8")
        }
        route("Magic-Ball-8") {
            get {
                call.respond(FreeMarkerContent("index.ftl", mapOf("questions" to questions)))
            }
            get("new") {
                // Show a page with fields for creating a new article
            }
            post {
                val formParameters = call.receiveParameters()
                val question = formParameters.getOrFail("question")
                val answer = Answer(question)
                questions.add(answer)
                call.respondRedirect("/Magic-Ball-8")
            }
            get("{id}") {
                // Show an article with a specific id
            }
        }
        // Static plugin. Try to access `/static/index.html`
        static("/static") {
            resources("files")
        }
    }
}
