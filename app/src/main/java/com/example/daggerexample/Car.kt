package com.example.daggerexample

/*
예제에서 의존성이 될 클래스
 */
class Car(val engine: Engine) {

    fun start() {
        engine.start()
    }

}