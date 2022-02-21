package com.rybakov.weatherappmvvm.database

import androidx.lifecycle.LiveData
import com.rybakov.weatherappmvvm.model.Weather
import com.rybakov.weatherappmvvm.model.WeatherCache
import com.rybakov.weatherappmvvm.model.WeatherResponse

interface DatabaseRepository {
    val getWeather: LiveData<WeatherCache>
    suspend fun insert(weather: WeatherCache,onSuccess:()->Unit)
    suspend fun delete(weather: WeatherCache,onSuccess:()->Unit)
}