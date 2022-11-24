package com.MiguelKimetsu.di

import com.MiguelKimetsu.features.data.HeroList
import com.MiguelKimetsu.features.data.datasource.LocalListDataSourceImpl
import com.MiguelKimetsu.features.data.datasource.interfaces.ILocalListDatasource
import com.MiguelKimetsu.features.domain.repository.HeroRepositoryImpl

import com.MiguelKimetsu.features.domain.repository.IHeroRepository
import com.MiguelKimetsu.features.domain.service.HeroServiceImpl
import com.MiguelKimetsu.features.domain.service.IHeroService
import org.koin.dsl.module

val appModule = module {


    single<HeroList> { HeroList}

    single<ILocalListDatasource> {

        LocalListDataSourceImpl(get())

    }

    single <IHeroRepository> {

        HeroRepositoryImpl(get())

    }

    single <IHeroService> {

        HeroServiceImpl(get())

    }

}