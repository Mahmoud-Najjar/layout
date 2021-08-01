package com.mahmoud.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val integers :List<Int> = listOf(1,1,2,2,1,2)
        val characters:List<Char> = listOf('a','b')
        val colors= listOf("green","purple","blue")
        println("List:$integers")
        println("List:$characters")
        println("First element: ${integers[0]}")
        println("second charecters:${characters[1]} ")
        println("last charecters:${characters.last()} ")
        println("is integers list contains 4 ? ${integers.contains(4)}" )
        println(" charecters list size:${characters.size} ")
        println("reversed list colors: ${colors.reversed()} ")

        val entrees = mutableListOf<String>()
        println("Entrees: $entrees")

        // Add individual items using add()
        println("Add noodles: ${entrees.add("noodles")}")
        println("Entrees: $entrees")
        println("Add spaghetti: ${entrees.add("spaghetti")}")
        println("Entrees: $entrees")

        // Add a list of items using addAll()
        val moreItems = listOf("ravioli", "lasagna", "fettuccine")
        println("Add list: ${entrees.addAll(moreItems)}")
        println("Entrees: $entrees")

        // Remove an item using remove()
        println("Remove spaghetti: ${entrees.remove("spaghetti")}")
        println("Entrees: $entrees")
        println("Remove item that doesn't exist: ${entrees.remove("rice")}")
        println("Entrees: $entrees")

        // Remove an item using removeAt() with an index
        println("Remove first element: ${entrees.removeAt(0)}")
        println("Entrees: $entrees")

        // Clear out the list
        entrees.clear()
        println("Entrees: $entrees")

        // Check if the list is empty
        println("Empty? ${entrees.isEmpty()}")
    }

    }


}