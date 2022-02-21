package ghar.dfw.perm.kotlinapplied.utils

import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class CarInfoService @Inject constructor(

) {
    @Provides
    fun provideCars(cars: List<Car>) : List<Car> {
        return cars
    }
}