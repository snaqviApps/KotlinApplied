package ghar.dfw.perm.kotlinapplied.utils.algos_n_collections.algos

class Miscellanea {

  companion object {
    private val rotatedArrays: ArrayList<Array<Int>> = ArrayList()
    private var terms = Pair<Int?, Int?>(null, null)
    private var listStrPalindrome = ArrayList<String>()

    // fibonacci
    fun fibonacciWithSequence(range:Int) = sequence {
      terms = Pair(0, 1)
      while (true) {
        yield(terms.first)
        terms = Pair(terms.second, terms.second?.let {
          terms.first?.plus(it) })
      }
    }.take(range)

    // Palindrome
    fun checkPalindrome(str: String): Boolean {
      val inStr = str.lowercase()
      listStrPalindrome.add(inStr)
      listStrPalindrome.add(inStr.reversed())
      return listStrPalindrome[1] == listStrPalindrome[0]
    }

    // Arrays rotation
    fun rotateRightArraysNTimes(arrayIn: Array<Int>, n: Int): IntArray? {
      rotatedArrays.add(arrayIn)
      val arrayOut = IntArray(arrayIn.size)
      //  for (i in (arrayIn.size - 1) downTo 0) {
      for (i in arrayIn.indices) {
        if (i == (arrayIn.size - 1)) {
          arrayOut[0] = arrayIn[i]
        } else {
          arrayOut[i + 1] = arrayIn[i]
        }
      }
      if (n == 0) {
        return null
      } else {
        println("array rotation in progress: ${arrayOut.toList()}")
        rotateRightArraysNTimes(arrayOut.toTypedArray(), n - 1)
      }
      return rotatedArrays[n].toIntArray()    // correct
    }

  }

}

