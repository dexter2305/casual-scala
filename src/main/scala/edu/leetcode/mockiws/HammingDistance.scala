package edu.leetcode.mockiws

import scala.annotation.tailrec

object HammingDistance {

  def main(args: Array[String]): Unit = {
    println(hammingDistance(2, 1))
    println("hammingWeight(2):" + hammingWeight(2))
  }

  def hammingDistance(x: Int, y: Int): Int = {
    val xor = x ^ y
    println(Integer.bitCount(xor))

    @tailrec
    def helper(i: Int, value: Int, acc: Int): Int = {
      i match {
        case 32 => acc
        case _ => helper(i + 1, value >> 1, acc + (value & 1))
      }
    }

    helper(1, xor, 0)
  }

  def hammingWeight(number: Int): Int = {
    @tailrec
    def helper(index: Int, currentValue: Int, accumulator: Int): Int = {
      index match {
        case 32 => accumulator
        case _ => helper(index + 1, currentValue >> 1, accumulator + (currentValue & 1))
      }
    }
    helper(1, number, 0)
  }
}
