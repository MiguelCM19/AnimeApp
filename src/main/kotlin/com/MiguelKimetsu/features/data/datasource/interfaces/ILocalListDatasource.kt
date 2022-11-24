package com.MiguelKimetsu.features.data.datasource.interfaces

import com.MiguelKimetsu.features.data.datasource.dto.HeroDto

interface ILocalListDatasource {
    suspend fun getAllHeroes(): List<HeroDto>
}