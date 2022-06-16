package ghar.dfw.perm.kotlinapplied.utils.algos_n_collections.algos.search

import kotlin.math.absoluteValue

class Searching {
  companion object {

    /**
     * reified version that makes sure that generic type is not 'erased at run-time'
    */
   inline fun <reified T> linearSearch(list: List<*>, target : T) : Any? {
     list.forEachIndexed { index, t ->
       if (t == target) {
         return index as T
       }
     }
     return when (target) {
       is String -> "-ve" as T
       is Int -> -1
       else -> {null}
     }
    }

    /** binary search */
    fun binarySearchRecursive(sortedlist: List<Int>, target:Int, low: Int, high:Int) : Any? {
      while(low <= high){
        val mid = ((low + high) / 2)
        when {
          target > sortedlist[mid] -> return binarySearchRecursive(sortedlist, target, mid + 1, high)   // search towards b
          target < sortedlist[mid] -> return binarySearchRecursive(sortedlist, target, low, mid -1)    // search towards left
          target == sortedlist[mid]  -> return mid
        }
      }
      return -1
    }

  }
}
