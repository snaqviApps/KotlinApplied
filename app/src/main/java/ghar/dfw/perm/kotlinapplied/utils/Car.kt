package ghar.dfw.perm.kotlinapplied.utils

import dagger.Module
import javax.inject.Inject

@Module
data class Car @Inject constructor(
    private val _color: String,
    private val _model: String,
    private val _year: Int) {

    val color =  _color
    val model = _model
    val year = _year
}