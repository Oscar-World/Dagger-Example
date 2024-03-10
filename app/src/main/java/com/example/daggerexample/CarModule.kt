package com.example.daggerexample

import dagger.Module
import dagger.Provides

/*
주입할 의존성을 세팅하는 곳.
클래스 단위에 @Module 어노테이션을 붙이며
의존성 단위에는 @Provides 어노테이션을 붙인다.
 */
@Module
class CarModule {

    @Provides
    fun provideCar(engine: Engine): Car {
        return Car(engine)
    }

    @Provides
    fun provideEngine() : Engine {
        return Engine()
    }

}