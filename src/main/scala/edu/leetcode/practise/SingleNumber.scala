package edu.leetcode.practise

object SingleNumber {

  def main(args: Array[String]): Unit = {
    println("findSingleNumber:" + findSingleNumber(Array(1, 2, 1, 2, 1)))
    println("productDigits:" + productDigits(520))
    println("subSumFromProduct:" + subtractSumFromProduct(4421))
    println("makeArray:" + makeArray(4421).mkString("|"))
  }

  def subtractSumFromProduct(given: Int): Int = {
    //productDigits(given) - sumDigits(given)
    val digits = makeArray(given)
    digits.product - digits.sum
  }

  def findSingleNumber(numbers: Array[Int]): Int = {
    numbers.foldLeft(0)(_ ^ _)
  }

  def makeArray(given: Int): Array[Int] = {
    val digits: Array[Int] = Array[Int]()
    @scala.annotation.tailrec
    def helper(value: Int, accumulator: Array[Int]): Array[Int] = {
      value match {
        case value if value < 10 => accumulator :+ value
        case _ => helper(value / 10 , accumulator :+ (value % 10))
      }
    }

    helper(given, digits)
  }


  def productDigits(number: Int): Int = {
    @scala.annotation.tailrec
    def helper(current: Int, accumulator: Int): Int = {
      current match {
        case current if current < 10 => accumulator * current
        case _ => helper(current / 10, accumulator * (current % 10))
      }
    }

    helper(number, 1)
  }

  def sumDigits(number: Int): Int = {
    @scala.annotation.tailrec
    def helper(current: Int, accumulator: Int): Int = {
      current match {
        case current if current < 10 => accumulator + current
        case _ => helper(current / 10, accumulator + (current % 10))
      }
    }

    helper(number, 0)
  }

}
