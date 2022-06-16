package ghar.dfw.perm.kotlinapplied.utils.algos_n_collections.algos.collections

class GenericsSamples {

  fun <T> printing(list : List<T>){
    for(item in list){
      println("item in list: $item")
    }
  }

}