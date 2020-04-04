package edu.learnings.lc

import scala.annotation.tailrec

object MoveZeroes {

  def main(args: Array[String]): Unit = {
    val numbers = Array(2, 0, 0, 3, 0, 5)
    println(moveZeroes(numbers))
  }

  def moveZeroes(numbers: Array[Int]): Array[Int] = {
    for (index <- 0 until numbers.length) {
      if (numbers(index) == 0) {
        val optionIndex = nonZeroValuedIndex(numbers, index + 1)
        if (optionIndex != None) {
          numbers(index) = numbers(optionIndex.get)
          numbers(optionIndex.get) = 0
          println(s"updated - ${numbers.mkString(" ")}")
        }
      }
    }
    numbers
  }

  @tailrec
  def nonZeroValuedIndex(numbers: Array[Int], searchFrom: Int): Option[Int] = {
    //println(s"$searchFrom & ${numbers.length}")
    if (searchFrom == numbers.length) return None
    if (numbers(searchFrom) == 0) {
      nonZeroValuedIndex(numbers, searchFrom + 1)
    } else {
      //println(s"nz num -> ${numbers(searchFrom)}")
      Some(searchFrom)
    }
  }

}
