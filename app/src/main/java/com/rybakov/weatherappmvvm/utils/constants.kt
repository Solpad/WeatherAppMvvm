package com.rybakov.weatherappmvvm.utils

import com.rybakov.weatherappmvvm.MainActivity
import com.rybakov.weatherappmvvm.database.DatabaseRepository

lateinit var APP_ACTIVITY: MainActivity
lateinit var REPOSITORY: DatabaseRepository
const val BaseUrl = "http://api.openweathermap.org/"
const val AppId = "c0c4a4b4047b97ebc5948ac9c48c0559"
const val units = "metric"
const val lang = "ru"

