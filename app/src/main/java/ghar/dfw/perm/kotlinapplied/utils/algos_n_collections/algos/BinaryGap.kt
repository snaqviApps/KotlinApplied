package ghar.dfw.perm.kotlinapplied.utils.algos_n_collections.algos

class BinaryGap {

    companion object {
        //        private var gapsList = ArrayList<ArrayList<Int>>()    // multiple entries
        private var gapsList = ArrayList<Int>()
        private lateinit var gapsStack: ArrayDeque<Int>

        fun findBinaryGap(
            binList: MutableList<String>
//        newInputList: ArrayList<String>,
        ): ArrayList<Int>? {
            var fromInt10: Int
            var toInt01: Int
            val processList = ArrayList<String>()
            val nextInputList = ArrayList<String>()
            val binGap =  ArrayList<Int>()
            gapsStack = ArrayDeque<Int>()

            binList.asSequence()
                .forEachIndexed { _, it ->
                    if (it.indexOf("10") != -1 && it.indexOf("01") != -1) {
                        fromInt10 = it.indexOf("10")
                        toInt01 = it.indexOf("01")
                        processList.add(it.substring(fromInt10, toInt01 + 2))
                        nextInputList.add(it.substring(toInt01 + 1))
                    } else {
                        return null
                    }
                }
                .also {
                    processList.forEach {
                        binGap.add(it.length - 2)
                        gapsList.add(binGap[0])       // current implementation is good with input-list of size = 1
                        gapsStack.addFirst(binGap[0])  // does not add
                    }
                    println("bin-input, gap, nextArray $binList, $binGap, $nextInputList")
                }
            findBinaryGap(nextInputList)
            return gapsList
        }
    }
}
