package ghar.dfw.perm.kotlinapplied.utils.algos_n_collections.algos

/**
 * LeetCode challenge:
 * Median of two arrays
 * Samples
 *
 *  Sample Inputs:1
 *  nums1 = (0, 2, 1),
 *  nums2 = (3, 4, 5)
 *
 *  Sample Inputs: 2
 *    nums1 = (1, 3)
 *    nums2 = (2)
 *
 */
class TwoArraysMedian() {

  companion object {
    fun medianOfTwoSortedArrays(inputArray1: IntArray, inputArray2: IntArray): Double {

      val inputData = inputArray1.toList() + inputArray2.toList()
      val concatenatedArrays = inputData.toList().sorted()
      val dataSize = concatenatedArrays.size

      /**
       * 1. Time complexity: 866ms
       * Space complexity: 61.4ms
       *   return if((dataSize % 2) != 0) concatenatedArrays.toIntArray()[dataSize / 2].toDouble()
       *   else return (concatenatedArrays.toIntArray()[(dataSize/2) - 1] +  concatenatedArrays.toIntArray()[(dataSize/2)]).toDouble() / 2
       */

      /**
       * 2. Time Complexity: 634 ms, faster than 18.81% of Kotlin online submissions for Median of Two Sorted Arrays.
       * Space complexity / Memory Usage: 61.3 MB,

      when(dataSize % 2){
      0  -> return ((concatenatedArrays.toIntArray()[(dataSize/2) - 1] +  concatenatedArrays.toIntArray()[(dataSize/2)]).toDouble() / 2)
      }
      return concatenatedArrays.toIntArray()[dataSize / 2].toDouble()
       */

      /**
       * 3. Time - complexity: 593ms    -----> 25.36 faster than to Kotlin online submissions for Median of Two Sorted Arrays.
       * Space - complexity: 59.1MB  -----> 21.06% less then Kotlin online submissions for Median of Two Sorted Arrays.
       */
      if (dataSize % 2 != 0) {
        return concatenatedArrays.toIntArray()[dataSize / 2].toDouble()
      }
      return ((concatenatedArrays.toIntArray()[(dataSize / 2) - 1] + concatenatedArrays.toIntArray()[(dataSize / 2)]).toDouble() / 2)
    }


  }
}