package com.MiguelKimetsu.features.presentation.mapper

import com.MiguelKimetsu.features.domain.model.HeroDM
import com.MiguelKimetsu.features.presentation.model.Hero


fun HeroDM.toHero() = Hero(
    id, nombre, apellido, edad, genero, raza, poder, habilidad, arma, imagen

)


