package com.ilyascilingir.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("hello kotlin")

        // Variables & Constants

        //Integer
        println("-------Integer------")

        var x = 5
        var y = 4

        println(x*y)

        var age = 35

        var result = age/7*5

        println(result)

        //Defining (tanımlamak)

        var myInteger : Int

        //Initialize (değer atamak)

        myInteger = 10
        myInteger = 20

        val a : Int = 5

        val b : Int = 23
        println(b/2)

    // val olursa sonradan değiştirilemez, var ise değiştirilebilir.

        //Long

        var myLong : Long = 100

        //Double & Float
        println("-------Double & Float------")

        val pi = 3.14

        println(pi * 2)

        val myFloat = 3.14f

        println(myFloat * 2)

        var myDouble : Double = 23.0
        println(myDouble / 2)

        //camelCase
        //snake_case

        //String
        println("-------String------")

        val myString = "ilyas cilingir"

        val name = "Ali"
        val surname = "Koc"

        val fullname = name + " " + surname

        println(fullname)

        val larsName : String = "Lars"

        println(myString.capitalize())

        //Boolean
        println("-------Boolean------")

        var myBoolean : Boolean = true
        myBoolean = false

        var isAlive = true

        // <
        // >
        // <=
        // >=
        // ==
        // !=
        // && -> AND
        // || -> OR

        println( 3 < 5 )
        println( 7 > 9 )
        println( 5 == 5 )
        println( 3 != 5 )

        // Conversion
        println("-------Conversion------")

        var myNumber = 5
        var myLongNumber = myNumber.toLong()
        println(myLongNumber)

        var input = 10
        var inputInteger = input.toInt()
        println(inputInteger * 2)

        //Collections

            //Arrays

        println("-------Arrays------")

        val myArray = arrayOf("James","Kirk","Rob","Lars")
        //index
        println(myArray[0])
        myArray[0] = "James Hetfield"
        println(myArray[0])
        println(myArray)

        myArray.set(1,"Kirk Hammett")
        println(myArray[1])

        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])

        val myNewArray = doubleArrayOf(1.0,2.0,3.0)

        val mixedArrray = arrayOf("Atil", 5)
        println(mixedArrray[0])
        println(mixedArrray[1])

        //List - ArrayList
        println("-------List------")

        val myMusician = arrayListOf<String>("James","Kirk")
        myMusician.add(2,"Lars")
        println(myMusician[2])
        myMusician.add(0,"Rob")
        println(myMusician[0])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(200)

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("Atil")
        myMixedArrayList.add(12.25)
        myMixedArrayList.add(true)

        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])


        //Set
        println("-------Set------")

        val myExampleArray = arrayOf(1,1,2,3,4)

        println("Element 1 : ${myExampleArray[0]} ")
        println("Element 1 : ${myExampleArray[1]} ")

        val mySet = setOf<Int>(1,1,2,3,4)

        println(mySet.size)

        //For Each

        mySet.forEach{ println(it) }

        val myStringSet = HashSet<String>()
        myStringSet.add("Atil")
        myStringSet.add("Atil")
        println(myStringSet.size)


        //Map - HashMap
        println("-------Map------")

        // Key - Value

        val fruitArray = arrayOf("Apple","Banana")
        val caloriesArray = arrayOf(100,150)

        println("${fruitArray[0]} : ${caloriesArray[0]}")
        println("${fruitArray[1]} : ${caloriesArray[1]}")

        // Ya da ...

        val fruitCalorieMap = hashMapOf<String,Int>()
        fruitCalorieMap.put("Apple",100)
        fruitCalorieMap.put("Banana",150)
        println(fruitCalorieMap["Apple"])

        val myHashMap = HashMap<String,String>()

        val myNewMap = hashMapOf<String,Int>("A" to 1, "B" to 2 , "C" to 3)
        println(myNewMap["C"])

        //Operator
        println("-------Operator------")

        var m = 5
        println(m)
        m = m +1
        println(m)
        m++
        println(m)
        m--
        println(m)

        var n = 7

        println(n > m)

        // &&
        // ||

        println(n>m && 1>2)
        println(n>m || 1>2)

        println( 10 + 2 )
        println( 10 - 2 )
        println( 10 * 2 )
        println( 10 / 2 )
        // Remainder (kalan sayı yazılır)
        println( 10 % 2 )

        //If Control
        println("-------If Control------")

        val myNumberAge = 32

        if (myNumberAge < 30){
            println(" < 30 ")
        }else if ( myNumberAge >= 30 && myNumberAge < 40 ){
            println(" 30 - 40 ")
        }else if ( myNumberAge >= 40 && myNumberAge < 50 ){
            println(" 40 - 50 ")
        }else {
            println(" >= 50 ")
        }

        //Switch - When
        println("-------Switch - When------")

        val day = 3
        var dayString = ""

        /*if (day == 1){
            dayString = "Monday"
        }else if ( day == 2 ){
            dayString = "Tuesday"
        }else if ( day == 3 ) {
            dayString = "Wednesday"
        }

        println(dayString)*/

        when(day){
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesdday"
            else -> dayString =  ""
        }

        println(dayString)

        // Loops (For - While)
        println("-------Loops (For - While)------")

            //For Loop
        println("-------For Loop------")

        val myArrayofNumbers = arrayOf(12,15,18,21,24,27,30,33)
        val q = myArrayofNumbers[0] / 3 * 5
        println(q)

        println("-------------")

        for ( number in myArrayofNumbers ){
            val z  = number / 3 * 5
            println(z)
        }

        println("-------------")

        for ( i in myArrayofNumbers.indices ){
            val qz  = myArrayofNumbers[i] / 3 * 5
            println(qz)
        }

        println("-------------")

        for( a in 0..9){
            println(a)
        }

        var myStringArrayList = ArrayList<String>()
        myStringArrayList.add("İlyas")
        myStringArrayList.add("Cilingir")
        myStringArrayList.add("test")

        for ( str in myStringArrayList){
            println(str)
        }

        myStringArrayList.forEach { println(it) }

        //While Loop
        println("-------While Loop------")

        var j = 0
        while( j < 10 ){
            println(j)
            j = j + 1
        }

    }
}