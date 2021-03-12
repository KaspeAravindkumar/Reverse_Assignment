package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
class ReverseTest extends AnyFlatSpec {
  val reverse = new Reverse

  //TestCase for Reverse String
  "reverse of string" should "be found"in {
    val x = reverse.reverseString("Arun")
    assert(x == "nurA")
  }

  //TestCase for Reverse List of Integers
  "reverse list of Integers" should "be found" in{
    val res=reverse.reverseList(List(1,2,3,4))
    assert(res==List(4,3,2,1))
  }

  //TestCase for Reverse List of Strings
  "reverse list of Strings" should "be found" in{
    val res=reverse.reverseList(List("one","two","three","four"))
    assert(res==List("four","three","two","one"))
  }

  //TestCase for Reverse list of Any Data type
  "reverse list of any data type" should "be found" in{
    val res=reverse.reverseList(List("one",2,"three",4))
    assert(res==List(4,"three",2,"one"))
  }

  //Testcase should fail as the excpeted is wrong
  "Negative test case" should "be found" in{
    val res=reverse.reverseList(List("one",2.78,"three",4))
    assert(!(res==List(4,"three",2.78,1)))
  }



}
