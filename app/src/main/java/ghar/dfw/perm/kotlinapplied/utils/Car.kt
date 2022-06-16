package ghar.dfw.perm.kotlinapplied.utils

data class Car constructor(
    private val _color: String,
    private val _model: String,
    private val _year: Int) {

    val color =  _color
    val model = _model
    val year = _year
}