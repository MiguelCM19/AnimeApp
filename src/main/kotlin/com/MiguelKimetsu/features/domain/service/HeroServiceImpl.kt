package com.MiguelKimetsu.features.domain.service

import com.MiguelKimetsu.features.domain.model.HeroDM
import com.MiguelKimetsu.features.domain.repository.IHeroRepository

class HeroServiceImpl(private val heroRepository: IHeroRepository) : IHeroService {

    override suspend fun getAllHeroes() = heroRepository.getAllHeroes()
    }




