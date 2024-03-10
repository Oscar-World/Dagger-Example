package com.example.daggerexample

import android.util.Log

/*
예제에서 의존성이 될 클래스
 */
class Engine {

    fun start() {
        Log.d("Engine", "Dagger - Engine.start()")
    }

}
