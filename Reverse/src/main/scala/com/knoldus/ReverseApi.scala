package com.knoldus
import io.StdIn.readLine

object ReverseApi extends App {
     val reverse = new Reverse

    //list of String
    val listOfString = List("first", "second", "third", "fourth")

    //list of Int
    val listOfInt = List(0, 1, 2, 3, 4, 5)

    //reverse of whole List of strings.
    val reverseOfValuesOfList = reverse.reverseList(listOfString).map(x => reverse.reverseString(x))

    println("************Reverse*************")
    println(listOfString)
    println(listOfInt)
    print("Enter the string to be reversed : ")

    //String input from user
    val input = readLine()

    //reverse of string entered by user
    println(s"Reverse of $input is " + reverse.reverseString(input) + ".")

    //reverse of list of Int
    println(s"Reverse of $listOfInt is " + reverse.reverseList(listOfInt) + ".")

    //reverse of list of String
    println(s"Reverse of $listOfString is " + reverse.reverseList(listOfString) + ".")

    //reverse of whole list of string
    println(s"Reverse of whole list of strings $listOfString is " + reverseOfValuesOfList + ".")
  }

