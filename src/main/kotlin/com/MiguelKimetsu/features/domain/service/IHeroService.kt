package com.MiguelKimetsu.features.domain.service

import com.MiguelKimetsu.features.domain.model.HeroDM

interface IHeroService {
    suspend fun getAllHeroes(): List<HeroDM>
}