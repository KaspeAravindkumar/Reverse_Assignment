package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec
class ReverseTest extends AnyFlatSpec {
  val reverse = new Reverse

  //TestCase for Reverse String
  "reverse of string" should "be found"in {
    val x = reverse.reverseString("aravind")
    assert(x == "dnivara")
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



}
