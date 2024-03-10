package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

/*
의존성 주입 받을 대상에 @Inject 어노테이션을 붙인다.
Component를 초기화하고 액티비티를 지정해주면 의존성이 주입된다.
car 객체를 초기화 해준 부분이 없지만, 실행이 된다.
 */
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 의존성 수동 주입
//        val engine = Engine()
//        val car = Car(engine)
//
//        car.start()


        // Dagger
        val carComponent = DaggerCarComponent.builder()
            .carModule(CarModule())
            .build()

        carComponent.inject(this)

        car.start()

    }

}