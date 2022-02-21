package com.rybakov.weatherappmvvm.database.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.rybakov.weatherappmvvm.model.Weather
import com.rybakov.weatherappmvvm.model.WeatherCache
import com.rybakov.weatherappmvvm.model.WeatherResponse

@Dao
interface AppRoomDao {
    @Query("SELECT * from weather_tables")
    fun getWeather(): LiveData<WeatherCache>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(weather: WeatherCache)

    @Delete
    suspend fun delete(weather: WeatherCache)
}