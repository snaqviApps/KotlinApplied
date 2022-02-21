package ghar.dfw.perm.kotlinapplied.utils.algos_n_collections.algos

class ArrayEquilibriumPoint {

    fun findEquilibrium(arrayInt : IntArray, arrayLen: Int): Int {

        print("input to-be sumed: array entries: ${arrayInt.toList()}\n")
        var sum = 0
        var leftSum = 0
        var rightSum = 0

        for (i in arrayInt) {
            sum += i
        }
        rightSum = sum
        println("sum of the array: $sum")
        println()

        // 2nd step, finding equilibrium point
        for((index, item) in arrayInt.withIndex()) {
            rightSum -= item
            if (rightSum == leftSum) {
                return index
            }
            leftSum += item
            println("right sum: $rightSum, and left-sum: $leftSum")
        }
        return -1
    }

}