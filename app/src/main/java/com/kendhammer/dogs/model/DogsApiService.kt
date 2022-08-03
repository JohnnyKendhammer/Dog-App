package com.kendhammer.dogs.model

import com.kendhammer.dogs.di.DaggerApiComponent
import io.reactivex.Single
import javax.inject.Inject

class DogsApiService {

    @Inject
    lateinit var api: DogsApi

    init {
        DaggerApiComponent.create().inject(this)
    }

    fun getDogs(): Single<List<DogBreed>> {
        return api.getDogs()
    }
}