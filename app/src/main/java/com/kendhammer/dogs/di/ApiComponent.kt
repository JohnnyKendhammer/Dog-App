package com.kendhammer.dogs.di

import com.kendhammer.dogs.model.DogsApiService
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: DogsApiService)
}