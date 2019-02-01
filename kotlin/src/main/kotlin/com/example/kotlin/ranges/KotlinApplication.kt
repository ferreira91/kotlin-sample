package com.example.kotlin.ranges

class KotlinApplication

fun main(args: Array<String>) {

    println("===========================================================================================================")

    for (i in 1..100) { print(i) }

    println("\n")
    println("===========================================================================================================")

    for (i in 1 until 100) { print(i) }

    println("\n")
    println("===========================================================================================================")

    for (x in 2..10 step 2) { print(x) }

    println("\n")
    println("===========================================================================================================")

    for (x in 10 downTo 1) { print(x) }

    println("\n")
    println("===========================================================================================================")
}