package com.liamlouw

fun main(args: Array<String>) {
    print("Enter regex: ")

    val inputString = readLine()
    val inputStringArray = inputString!!.toCharArray()

    for (char in inputStringArray) print(char + " ")
}
