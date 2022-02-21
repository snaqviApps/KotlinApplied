package ghar.dfw.perm.kotlinapplied.utils.algos_n_collections.algos

class BinaryGap {

    companion object {
        //        private var gapsList = ArrayList<ArrayList<Int>>()        // multiple entries
        private var gapsList = ArrayList<Int>()
        private lateinit var gapsStack: ArrayDeque<Int>

        fun findBinaryGap(
            binList: MutableList<String>
//        newInputList: ArrayList<String>,
        ): ArrayList<Int>? {
            var fromIni10: Int
            var toIni01: Int
            val processList = ArrayList<String>()
            val newInputList = ArrayList<String>()
            val binGap =  ArrayList<Int>()
            gapsStack = ArrayDeque<Int>()

            binList.asSequence()
                .forEachIndexed { _, it ->
                    if (it.indexOf("10") != -1 && it.indexOf("01") != -1) {
                        fromIni10 = it.indexOf("10")
                        toIni01 = it.indexOf("01")
                        processList.add(it.substring(fromIni10, toIni01 + 2))
                        newInputList.add(it.substring(toIni01 + 1))
                    } else {
                        return null
                    }
                }
                .also {
                    processList.forEach {
                        binGap.add(it.length - 2)
                        gapsList.add(binGap[0])             // current implementation is good with input-list of size = 1
                        gapsStack.addFirst(binGap[0])       // does not add
                    }
                    println("bin-input, gap, nextArray $binList, $binGap, $newInputList")
                }
            findBinaryGap(newInputList)
            return gapsList
        }

        // fibonacci
        fun fibonacci() = sequence {
            var terms = Pair(0, 1)
            while (true) {
                yield(terms.first)
                terms = Pair(terms.second, terms.first + terms.second)
            }
        }
    }
}
