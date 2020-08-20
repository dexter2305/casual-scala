package edu.learnings.ib

import scala.annotation.tailrec

object PlusOne {

  def main(args: Array[String]): Unit = {

    println(s"res: ${plusOne(Array(1, 2, 3)) mkString " "}")
    println(s"res: ${plusOne(Array(9, 9)) mkString " "}")

  }


  def plusOne(numbers: Array[Int]): Array[Int] = {

    @scala.annotation.tailrec
    def addOne(numbers: List[Int], acc: List[Int], carry: Int): List[Int] = {
      println(s"processing input: ${numbers mkString " "} with carry:$carry & acc:${acc.mkString(" ")}")
      if (carry == 0) numbers.reverse ::: acc
      else numbers match {
        case head :: tail => addOne(tail, (head + carry) % 10 +: acc, (head + carry) / 10)
        case Nil => addOne(List(carry), acc, 0)
      }
    }

    @tailrec
    def dropLeadingZero(ns: List[Int]): List[Int] = {
      ns match {
        case 0 :: Nil => List(0)
        case 0 :: tail => dropLeadingZero(tail)
        case _ => ns
      }
    }

    val result = numbers.toList match {
      case Nil => Array[Int]()
      case _ => addOne(dropLeadingZero(numbers.toList).reverse, List[Int](), 1).toArray
    }
    result
  }

}
