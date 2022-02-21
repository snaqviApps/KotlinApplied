package ghar.dfw.perm.kotlinapplied.utils.algos_n_collections.sequences

//open class Sequencing<T : Car> @Inject constructor(){
//    fun toSequence(list : List<Car>) : Sequence<Car> {
//        return list.asSequence()
//    }
//}

class Sequencing() {
    fun<T> toSequence(list: List<T>) : Sequence<T> {       // approach: 02
        return list.asSequence()
    }
}