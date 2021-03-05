package com.knoldus

class Reverse {

  //function that returns reverse of a string
  def reverseString(string: String): String =
    (for (i <- string.length - 1 to 0 by -1) yield string(i)).mkString

  //function that returns reverse of a list
  def reverseList[A](list: List[A]): List[A] =
    (for (i <- list.length-1 to 0 by -1) yield list(i)).toList

}
