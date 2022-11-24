package com.MiguelKimetsu.features.domain.repository

import com.MiguelKimetsu.features.data.datasource.dto.HeroDto
import com.MiguelKimetsu.features.domain.model.HeroDM

interface IHeroRepository {

    suspend fun getAllHeroes(): List<HeroDM>

}
