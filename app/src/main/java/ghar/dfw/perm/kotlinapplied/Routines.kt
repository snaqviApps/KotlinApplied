package ghar.dfw.perm.kotlinapplied

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ghar.dfw.perm.kotlinapplied.utils.Car
import ghar.dfw.perm.kotlinapplied.utils.algos_n_collections.algos.*
import java.util.*

class RoutinesActivity : AppCompatActivity()  {

    private lateinit var queue: Queue<Car>

    // 2D Array Traverse Example: input data
    /**
     * using @InterviewSolutionsOne
     */
//    val logs1 = arrayOf(
//        arrayOf("58523", "user_1", "resource_1"),
//        arrayOf("62314", "user_2", "resource_2"),
//        arrayOf("54001", "user_1", "resource_3"),
//        arrayOf("200", "user_6", "resource_5"),
//        arrayOf("215", "user_6", "resource_4"),
//        arrayOf("54060", "user_2", "resource_3"),
//        arrayOf("53760", "user_3", "resource_3"),
//        arrayOf("58522", "user_22", "resource_1"),
//        arrayOf("53651", "user_5", "resource_3"),
//        arrayOf("2", "user_6", "resource_1"),
//        arrayOf("100", "user_6", "resource_6"),
//        arrayOf("400", "user_7", "resource_2"),
//        arrayOf("100", "user_8", "resource_6"),
//        arrayOf("54359", "user_1", "resource_3")
//    )

    val logs2 = arrayOf(
        arrayOf("300", "user_1", "resource_3"),
        arrayOf("599", "user_1", "resource_3"),
        arrayOf("900", "user_1", "resource_3"),
        arrayOf("1199", "user_1", "resource_3"),
        arrayOf("1200", "user_1", "resource_3"),
        arrayOf("1201", "user_1", "resource_3"),
        arrayOf("1202", "user_1", "resource_3")
    )

    val logs3 = arrayOf( arrayOf("300", "user_10", "resource_5") )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.routine_layout)

        /** find all characters in given array of Strings in given target string */
//        val strings = mutableListOf("tcabnihjs", "tbcanihjs", "baykkjl", "bbabylkkj","ccc", "breadmaking")
//        val inpArray :Array<String> = arrayOf( "cat", "baby", "dog", "bird", "car", "ax")
//        strings.forEach {
//            println("scrambled String: ${it}, match-result: ${InterviewSolutionsTwo.findEmbeddedWord(inpArray, it.toMutableList())}")
//        }
        /** find all characters-match in given array of Strings in given target string ENDS*/

        /**
         * Sum Two */
//        var result = LeetCode_n_Codlity.twoSum(intArrayOf(1, 2, 7), 3)
//        val result = LeetCode_n_Codlity.twoSum(intArrayOf(2,7,11,15), 9)
//        val result = LeetCode_n_Codlity.twoSum(intArrayOf(3,2,4), 6)
        val result = LeetCode_n_Codlity.pairSumsToATargetValue(intArrayOf(2, 5, 3, 3), 6)
//        println("Sum-Two: $result2")
//        println("--------------------------")
//        /** Sum Tow Ends  */
//
//        println("-------------------   Algorithms  ------------------------")
//        val equilibriumPoint = ArrayEquilibriumPoint()
//        with(equilibriumPoint) {
//            println(" 1st: Equilibrium point: ${findEquilibrium(intArrayOf(-7, 1, 5, 2, -4, 3, 0))}")
//            println(" 2nd: Equilibrium point: ${findEquilibrium(intArrayOf(-7, 1, 5, 2, 0))}")
//            println(" 3rd: Equilibrium point: ${findEquilibrium(intArrayOf(1, 2, 6, 4, 0, -1))}")
//        }
//
//        // custom array operations
//        val upperNullArray: Array<UppedNames?> = arrayOfNulls(10)
//        upperNullArray[0]?.add("null-0")
//        upperNullArray[1]?.add("null-1")
//        upperNullArray[2]?.add("null-2")
//
//        val uppedNames = UppedNames()
//        with(receiver = uppedNames) {
//            add("Hi are you")
//            add("Hi are you 2")
//            add("Hi are you 3")
//        }
//        println("uppedName: $uppedNames")
//
//        Array(5) { i ->
//            i + 5
//            println("five plus in array: ${i.toLong()}")
//        }
//        // dynamic array
//        val vStr: Vector<String> = Vector<String>()
//        for (i in 0..2) vStr.add(i.toString())
//        vStr.forEach {
//            print("vector: $it ")
//        }
//
//        // stacks
//        val carsStack = Stack<Car>()
//        carsStack.push(Car("red", "Nissan", 2012))
//        carsStack.push(Car("black", "Suzuki", 2021))
//        carsStack.forEach { print("stacking prints: ${it}") }
//
//        println("\n--------------binary gap---------------")
//        val inputDecimal = 132
//        val inputArrayToBinaryGap = intArrayOf(0, 33, 929, 1325)  // arguments will prevail that finishes first

        /** fibonacci approach with Sequences */
//        println("\n-----------fibonacci---------------")
//        println("fibonacci: ${Miscellanea.fibonacciWithSequence(4).toList()}")
         /** Check Palindrome */
//        val inputStrPalindrome = "pBHcHiiHChbP"
//        println(
//            "input: ${inputStrPalindrome.lowercase()}, Check-Palindrome:  ${
//                Miscellanea.checkPalindrome(inputStrPalindrome)
//            }"
//        )
        /** Check Palindrome ENDS HERE */

//        // Array Rotation
//        println("\n--------------array rotation---------------")
//        val inputArray = intArrayOf(2, 3, 4, 17)
//        val rotationCounts = 3
//        println("input array: ${inputArray.toList()}\trotation counter: $rotationCounts")
//        val outputArray = Miscellanea.rotateRightArraysNTimes(inputArray.toTypedArray(), rotationCounts)
//        println("rotated final array: ${outputArray?.toList()}")

        /** Queuing operations: */
//       val intQueue = LinkedList<Int>(listOf(24, 25, 26))
//       val names = LinkedList<String>(listOf("Adams", "James", "Cathy"))
//       val persons = LinkedList<Person>(listOf(
//                                        Person("Adams", "245 Four stones Blvd"),
//                                        Person("Cath", "200 Two stones St"),
//                                        Person("Bath", "400 Three stones St")))
//
//       val queueing = Queueing(intQueue, names, persons)
//        queueing.run {
//            println("names in Queue: $names")
//            names.add("Hi-first added-name")
//            println("with-add new names:  $names")
//            persons.remove()
//            println("=====Persons' ============ ")
//            println("remaining person: $persons")
//        }
        /** Queuing operations ENDS Here */

        /** Sequences */
//        val cars = listOf(
//            Car("red", "murano", 2012),
//            Car("green", "sentra", 2021),
//            Car("silver-grey", "rouge", 2016),
//            Car("blue", "maxima", 2018),
//            Car("red", "altima", 2020),
//        )
//        println("filter cars with red-color:" +
//            "${cars.asSequence()
//                .filter { it.color == "red" }
//                .map { it }.toList()}\n"
//        )
        /** Sequences ENDS HERE*/

        /** Generics */
        /** Generics ENDS HERE*/

        /** Searches */
        // 1. Linear search with list type: Generic:
//        val listForLinearSearch = listOf(1, 2, 3, 4, 7, 11, 5)
//        val target = 5
//        println("Int-type: target-index using linear: ${Searching.linearSearch(listForLinearSearch, target)}")
//        val stringsForLinearSearch:List<Any> = listOf("Hi", "", "me", "Hmm", "where")
//        val targetStr: Any = ""
//        val result = Searching.linearSearch(stringsForLinearSearch, targetStr)
//        println("String-type: target-index using linear: $result")

        //2. Binary Search
//        val listForSearch = listOf(1, 3, 7, 11, 5, 13, 15, 8)
//        val target = 8
//        println("Int-type: target-index using binary: ${Searching.binarySearchRecursive(
//            sortedlist = listForSearch.sorted(),
//            target=target,
//            low=0,
//            high=listForSearch.size,
//        )}")
        /** Searches ENDS HERE */

//        println("median of two sorted arrays: ${TwoArraysMedian.medianOfTwoSortedArrays(
//                inputArray1 = intArrayOf(1,1,1,1,1,1,1,1,1,1,4,4),
//                inputArray2 = intArrayOf(1,3,4,4,4,4,4,4,4,4,4))}"
//                )

//        val result = LeetCode_n_Codlity.findNextPositiveInteger(intArrayOf(1, 3, 6, 4, 1, 2))
//        val result = LeetCode_n_Codlity.findNextPositiveInteger(intArrayOf(1, 1, 2))
//        val result = LeetCode_n_Codlity.findFirstUnavailablePositiveInt(intArrayOf(-1, -3))
//        val result = LeetCode_n_Codlity.findNextPositiveInteger((intArrayOf(1, 2, 3, 4, 5))
//       val result = LeetCode_n_Codlity.findFirstUnavailablePositiveInt((intArrayOf(1, 2)))


        println("result: $result")

    }


}