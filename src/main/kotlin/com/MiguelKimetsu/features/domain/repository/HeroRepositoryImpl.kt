package com.MiguelKimetsu.features.domain.repository

import com.MiguelKimetsu.features.data.datasource.interfaces.ILocalListDatasource
import com.MiguelKimetsu.features.data.datasource.mapper.toHeroDM
import com.MiguelKimetsu.features.domain.model.HeroDM

class HeroRepositoryImpl(private val localList: ILocalListDatasource): IHeroRepository {
    override suspend fun getAllHeroes(): List<HeroDM> {
        return localList.getAllHeroes().map{heroDto -> heroDto.toHeroDM()}
    }
    }




