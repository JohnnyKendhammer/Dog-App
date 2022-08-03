package com.kendhammer.dogs.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.kendhammer.dogs.model.DogBreed
import com.kendhammer.dogs.model.DogDatabase
import kotlinx.coroutines.launch

class DetailsViewModel(application: Application) : BaseViewModel(application) {
    val dogLiveData = MutableLiveData<DogBreed>()

    fun fetch(dogUuid: Int) {
        launch {
            dogLiveData.value = DogDatabase(getApplication()).dogDao().getDog(dogUuid)
        }
    }
}