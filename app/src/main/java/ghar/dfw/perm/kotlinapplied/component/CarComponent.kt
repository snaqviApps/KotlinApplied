package ghar.dfw.perm.kotlinapplied.component

import dagger.Component
import ghar.dfw.perm.kotlinapplied.utils.CarInfoService

@Component(modules = [(CarInfoService::class)])
interface CarComponent {
    fun getCarInfoService() : CarInfoService
}