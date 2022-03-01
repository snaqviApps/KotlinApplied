package ghar.dfw.perm.kotlinapplied

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ghar.dfw.perm.kotlinapplied.book.UppedNames
import ghar.dfw.perm.kotlinapplied.component.DaggerCarComponent
import ghar.dfw.perm.kotlinapplied.utils.Car
import ghar.dfw.perm.kotlinapplied.utils.algos_n_collections.sequences.Sequencing
import ghar.dfw.perm.kotlinapplied.utils.algos_n_collections.algos.*
import java.util.*
import kotlin.collections.HashSet

class RoutinesActivity : AppCompatActivity()  {

    private lateinit var queue: Queue<Car>

    // 2D Array Traverse Example: input data
    /**
     * using @InterviewSolutionsOne
     */
    val logs1 = arrayOf(
        arrayOf("58523", "user_1", "resource_1"),
        arrayOf("62314", "user_2", "resource_2"),
        arrayOf("54001", "user_1", "resource_3"),
        arrayOf("200", "user_6", "resource_5"),
        arrayOf("215", "user_6", "resource_4"),
        arrayOf("54060", "user_2", "resource_3"),
        arrayOf("53760", "user_3", "resource_3"),
        arrayOf("58522", "user_22", "resource_1"),
        arrayOf("53651", "user_5", "resource_3"),
        arrayOf("2", "user_6", "resource_1"),
        arrayOf("100", "user_6", "resource_6"),
        arrayOf("400", "user_7", "resource_2"),
        arrayOf("100", "user_8", "resource_6"),
        arrayOf("54359", "user_1", "resource_3")
    )

    val logs2 = arrayOf(
        arrayOf("300", "user_1", "resource_3"),
        arrayOf("599", "user_1", "resource_3"),
        arrayOf("900", "user_1", "resource_3"),
        arrayOf("1199", "user_1", "resource_3"),
        arrayOf("1200", "user_1", "resource_3"),
        arrayOf("1201", "user_1", "resource_3"),
        arrayOf("1202", "user_1", "resource_3")
    )

    val logs3 = arrayOf(
        arrayOf("300", "user_10", "resource_5")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.routine_layout)

        queue = LinkedList()
        queue.add(Car("black", "Honda", 1994))
        queue.add(Car("brisk-red", "Toyota", 2009))

        /** 2D array finding max time span */
//        val interviewSolutionsOne = InterviewSolutionsOne()
//        val sortedArr = interviewSolutionsOne.findTimeSpan(logs1)
//        sortedArr.forEachIndexed {index, item ->
//            println("sorted final users:  $index, $item")
//        }
        /** 2D array finding max time span ENDS */

        /** find all characters in given array of Strings in given target string */
        val strings = mutableListOf("tcabnihjs", "tbcanihjs", "baykkjl", "bbabylkkj","ccc", "breadmaking")
        val inpArray :Array<String> = arrayOf( "cat", "baby", "dog", "bird", "car", "ax")
        strings.forEach {
            println("scrambled String: ${it.toList()}, match-result: ${InterviewSolutionsTwo.findEmbeddedWord(inpArray, it.toMutableList())}")
        }
        /** find all characters-match in given array of Strings in given target string ENDS*/


//        val iArr = intArrayOf(4,2,2, 3,3,3, 4, 5, 78)
//        val iList = iArr.toList()
//        val minV = iList.minOf { it }
//        val result = if(minV <= 0) 1 else minV
//        println("hi, min val is: $result")
//
//        val listFreq = mutableListOf<Int>()
//
//        val countEach = iList.groupingBy { it }.eachCount()
//
//        for((k,v) in countEach){
//            Log.d("hi", "key: $k, count-values: $v")
//            if(k == v){
//                listFreq.add(v)
//            }
//        }
//        println("max-val: ${listFreq.maxOrNull()}")

        val mutableMapCars = hashMapOf(
            2 to Car("red", "Ford", 2010),
            3 to Car("blue", "Toyota", 2014),
            9 to Car("white", "Toyota", 2020),
            4 to Car("pearl", "Honda", 2017)
        )
        for ((k, v) in mutableMapCars) {
            Log.d("hi", "key: $k, with data-class: value-set: $v")
        }
        mutableMapCars.forEach {
            Log.d("hi", "map values data-class: ${it.value}")
        }


        /**  Kotlin added Collections functions */
//         filter on Maps
        println("filtered cars printed results: ${mutableMapCars.filter { it.value.color == "blue" }}")

        // look for particualer criteria, any, above, groupby
        println("hi, any model-colored red: ${mutableMapCars.any { it.value.color == "red" }}")
        println("hi, how many model-year after 2004: ${mutableMapCars.count { it.value.year > 2004 }}")
        println("hi, grouped by color: ${mutableMapCars.values.groupBy { it.color }}")


        /** Dagger Sample Application */
        val component = DaggerCarComponent.builder().build().getCarInfoService()
        val carsListDaggered = component.provideCars(mutableMapCars.values.toList())
        println(" ----- Daggered  ------------- ")
        carsListDaggered.forEach {
            println("Injected cars-list: ${it}")
            // get the values
        }

        // look for particualer criteria
        println("hi-daggered, any model-red colored: ${carsListDaggered.any { it.color == "red" }}")
        println("hi-daggered, how many model-year after 2004: ${carsListDaggered.count { it.year > 2004 }}")
        println("hi-daggered, filtered by color then grouped by model-year greater than 2005 ${
            carsListDaggered
                .filter { it.color == "red" }
                .groupBy { it.year > 2005 }
        }")

        // apply Kotlin - Pure on Collections
        // Using Sequences
        println("-------------------    Sequencing  ------------------------")
        val sequencing = Sequencing()
        val cars = mutableMapCars.values.toList()
        cars.forEach {
            println("Sequencing cars: $it")
        }
        println("------------------- Sequencing with Cars--------------------")
        sequencing.toSequence(cars)
//            .filter { println("filtered for Yr <= 2014: ${it.year}");  it.year <= 2014 }  //  filtering does NOT WORK
            .filter { it.year == 2020 }
//            .map { println(" mapping filtered by color:   ${it.color}"); it.color.uppercase() }
            .map { println(" mapping filtered by color: ${it.color.uppercase()}") }
            .toList()
            .forEach {
                println("filtered by color then upper-cased: $it")
            }

        val pairs = listOf(Pair(1, "1"), Pair(2, "2nd"))
        pairs.forEach { println("pairs-first: ${it.first}") }
        println("-------------------   Algorithms  ------------------------")
        val equilibriumPoint = ArrayEquilibriumPoint()
        with(equilibriumPoint) {
//            println(" 1st: Equilibrium point: ${findEquilibrium(intArrayOf(-7, 1, 5, 2, -4, 3, 0), 7)}")
//            println(" 2nd: Equilibrium point: ${findEquilibrium(intArrayOf(-7, 1, 5, 2, 0), 5)}")
            println(" 3rd: Equilibrium point: ${findEquilibrium(intArrayOf(1, 2, 6, 4, 0, -1), 6)}")
        }

        // custom array operations
        val upperNullArray: Array<UppedNames?> = arrayOfNulls(10)
        upperNullArray[0]?.add("null-0")
        upperNullArray[1]?.add("null-1")
        upperNullArray[2]?.add("null-2")

        val uppedNames = UppedNames()
        with(receiver = uppedNames) {
            add("Hi are you")
            add("Hi are you 2")
            add("Hi are you 3")
        }
        println("uppedName: $uppedNames")

        Array(5) { i ->
            i + 5
            println("five plus in array: ${i.toLong()}")
        }
        // dynamic array
        val vStr: Vector<String> = Vector<String>()
        for (i in 0..2) vStr.add(i.toString())
        vStr.forEach {
            print("vector: $it ")
        }

        // stacks
        val carsStack = Stack<Car>()
        carsStack.push(Car("red", "Nissan", 2012))
        carsStack.push(Car("black", "Suzuki", 2021))
        carsStack.forEach { print("stacking prints: ${it}") }

        println("\n--------------binary gap---------------")
        val inputDecimal = 132
//        val inputArrayToBinaryGap = intArrayOf(0, 33, 929, 1325)  // arguments will prevail that finishes first
        val inputArrayToBinaryGap = intArrayOf(inputDecimal)
        val bList = sequencing.toSequence(inputArrayToBinaryGap.toMutableList())
            .map { Integer.toBinaryString(it) }
            .toList()
        bList.forEach { println("Decimal input: $inputDecimal\tbinary extracted: $it") }
        val gaps = BinaryGap.findBinaryGap(bList.toMutableList())
        println("binary-gap: ${gaps?.maxOrNull()}")

        // fibonacci approach with Sequences
        println("\n-----------fibo---------------")
        println("fibo: ${Miscellanea.fibonacci().take(7).toList()}")
        // Check Palindrome
        val inputStrPalindrome = "pBHcHiiHChbP"
        println(
            "input: ${inputStrPalindrome.lowercase()}, Check-Palindrome:  ${
                Miscellanea.checkPalindrome(
                    inputStrPalindrome
                )
            }"
        )
        // Array Rotation
        println("\n--------------array rotation---------------")
        val inputArray = intArrayOf(2, 3, 4, 17)
        val rotationCounts = 3
        println("input array: ${inputArray.toList()}\trotation counter: $rotationCounts")
        val outputArray = Miscellanea.rotateRightArraysNTimes(inputArray.toTypedArray(), rotationCounts)
        println("rotated final array: ${outputArray?.toList()}")

    }

}




