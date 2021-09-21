package com.example.apachecollectionstest

import org.apache.commons.lang3.tuple.ImmutablePair
import org.apache.commons.lang3.tuple.Pair
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.io.IOException
import java.util.ArrayList
import java.util.HashMap

@Component
class Main : CommandLineRunner {
    @Throws(IOException::class)
    override fun run(vararg args: String) {
        println("========== Main run Started ========")

        println("DEBUG POINT 1")
        val hashMap: MutableMap<String, String> = HashMap()
        for (i in 1..3000) {
            hashMap[i.toString()] = i.toString()
        }

        println("DEBUG POINT 2 After 3000 objects added to map")

        /*val listPair: MutableList<Pair<String, String>> = ArrayList()
        for (i in 1..3000) {
            listPair.add(ImmutablePair(i.toString(), i.toString()))
        }*/

        println("DEBUG POINT 2 After 3000 objects added as Pair in List")

        println("========== Main run Ended ========")
    }
}