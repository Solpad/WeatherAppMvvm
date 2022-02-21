package com.rybakov.weatherappmvvm.screens.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.rybakov.weatherappmvvm.database.room.AppRoomDatabase
import com.rybakov.weatherappmvvm.database.room.AppRoomRepository
import com.rybakov.weatherappmvvm.model.WeatherCache
import com.rybakov.weatherappmvvm.model.WeatherResponse
import com.rybakov.weatherappmvvm.utils.REPOSITORY
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DatabaseViewModel(application: Application) : AndroidViewModel(application){

    private val mContext = application

    fun initDatabase(onSuccess:() -> Unit){
        val dao = AppRoomDatabase.getInstance(mContext).getAppRoomDao()
        REPOSITORY = AppRoomRepository(dao)
        onSuccess()
    }

    fun insert(weather: WeatherCache, onSuccess:() -> Unit) =
            viewModelScope.launch(Dispatchers.IO) {
                REPOSITORY.insert(weather){
                    onSuccess()
                }
            }

}