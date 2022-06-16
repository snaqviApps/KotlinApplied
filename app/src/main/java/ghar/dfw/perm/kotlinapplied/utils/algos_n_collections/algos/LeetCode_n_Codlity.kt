package ghar.dfw.perm.kotlinapplied.utils.algos_n_collections.algos

class LeetCode_n_Codlity() {

  companion object {

    /**
     * find the pair of integers that could add up to a 'target' integer
     */
    fun pairSumsToATargetValue(input: IntArray, target: Int): Boolean {

/*      *//** Quadratic Time-complexity *//*
      val output = IntArray(2)
      for (i in input.toList().indices){
         for(j in i + 1 until input.size){
           if(input[i] + input[j] == target) {
             output[0] = i
             output[1] = j
             return output
           }
         }
      }
      *//** Quadratic Time-complexity */

      /** Linear [O(n)] Time-complexity */
      val hashSet = hashSetOf<Int>()
      for(num in input){
        if(hashSet.contains(target - num)) {
          return true
        }
        hashSet.add(num)
      }
      return false
      /** Linear [O(n)] Time-complexity */

    }

    /**
     * finds minimum 'un-available' +ve integer from input collection
     * Example:
     * 1. {1, 2, 3, 4} ---> output: 5
     * 2. {-1, 0} --------> output: 1
     * 3. {2, 1, 1} ------> output: 3
      */
  fun findFirstUnavailablePositiveInt(A: IntArray): Int {

    val SEQ_THRESHOLD = 2_000

    var result = SEQ_THRESHOLD
    val sortedInput = A.toList().sorted()
    if(sortedInput.toList().all { it < 0 }) {
      return 1
    }
    else {
      val distinctData = sortedInput.distinct()
      val target = distinctData.size
      for(i in 1..target) {
        if(i != distinctData[i - 1]) {
          result = i
          return result
        }
      }
      result = sortedInput.maxOrNull()!! + 1
      return result
    }
  }

  }
}