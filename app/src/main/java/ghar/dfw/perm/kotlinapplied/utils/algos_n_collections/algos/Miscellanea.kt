package ghar.dfw.perm.kotlinapplied.utils.algos_n_collections.algos

class Miscellanea {


    companion object {

        private var  terms = Pair<Int?, Int?>(null, null)
        private var listStrPalindrome = ArrayList<String>()


        // fibonacci
        fun fibonacci() = sequence {
            terms = Pair(0, 1)
            while (true) {
                yield(terms.first)
                terms = Pair(terms.second, terms?.second
                    ?.let { terms.first?.plus(it) })
            }
        }

        // Palindrome
        fun checkPalindrome(str: String) : Boolean {
            val inStr = str.lowercase()
            listStrPalindrome.add(inStr)
            listStrPalindrome.add(inStr.reversed())
            return listStrPalindrome[1] == listStrPalindrome[0]
        }
    }

}