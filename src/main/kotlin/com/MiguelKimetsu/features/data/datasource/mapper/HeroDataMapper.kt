package com.MiguelKimetsu.features.data.datasource.mapper

import com.MiguelKimetsu.features.data.datasource.dto.HeroDto
import com.MiguelKimetsu.features.domain.model.HeroDM

fun HeroDto.toHeroDM(): HeroDM {

    return HeroDM(
        id, nombre, apellido, edad, genero, raza, poder, habilidad, arma, imagen,
    )
}