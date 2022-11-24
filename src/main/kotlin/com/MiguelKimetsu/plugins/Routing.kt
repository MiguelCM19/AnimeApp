package com.MiguelKimetsu.plugins

import com.MiguelKimetsu.features.domain.service.IHeroService
import com.MiguelKimetsu.features.presentation.getAllHeroes

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import org.koin.java.KoinJavaComponent.inject
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    
val heroService : IHeroService by inject()

    routing {
        getAllHeroes(heroService)


        // Static plugin. Try to access `/static/index.html`
        static("/static") {
            resources("static")
        }
    }
}
