package com.rybakov.weatherappmvvm.database.room

import androidx.lifecycle.LiveData
import com.rybakov.weatherappmvvm.database.DatabaseRepository
import com.rybakov.weatherappmvvm.model.WeatherCache
import com.rybakov.weatherappmvvm.model.WeatherResponse

class AppRoomRepository(private val appRoomDao: AppRoomDao):DatabaseRepository {

    override val getWeather: LiveData<WeatherCache>
        get() = appRoomDao.getWeather()

    override suspend fun insert(weather: WeatherCache, onSuccess: () -> Unit) {
        appRoomDao.insert(weather)
        onSuccess()
    }

    override suspend fun delete(weather: WeatherCache, onSuccess: () -> Unit) {
        appRoomDao.delete(weather)
        onSuccess()
    }
}