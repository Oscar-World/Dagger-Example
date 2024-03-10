package com.example.daggerexample

import dagger.Component

/*
인터페이스 단위에 @Component 어노테이션을 붙이고 연결할 Module을 작성해준다.
의존성 주입 대상의 단위(여기서는 액티비티)를 인자로 삼는 메서드를 만들어준다.
 */
@Component(modules = [CarModule::class])
interface CarComponent {

    fun inject(activity: MainActivity)

}