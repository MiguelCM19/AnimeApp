package com.MiguelKimetsu.features.data.datasource

import com.MiguelKimetsu.features.data.HeroList
import com.MiguelKimetsu.features.data.datasource.dto.HeroDto
import com.MiguelKimetsu.features.data.datasource.interfaces.ILocalListDatasource

class LocalListDataSourceImpl(private val localList : HeroList):ILocalListDatasource {
    override suspend fun getAllHeroes(): List<HeroDto> {
        return localList.listOfHeroes
    }



}