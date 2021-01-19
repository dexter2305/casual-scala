package edu.learnings.leetcode

/**
 *
 * Question: https://leetcode.com/problems/counting-bits/
 * O(n) solution
 *
 *
 * Sample data
 *
 * 0  has 0 in  0000
 * 1  has 1 in  0001
 * 2  has 1 in  0010
 * 3  has 2 in  0011
 * 4  has 1 in  0100
 * 5  has 2 in  0101
 * 6  has 2 in  0110
 * 7  has 3 in  0111
 * 8  has 1 in  1000
 * 9  has 2 in  1001
 * 10 has 2 in  1010
 *
 * Hints:
 * 1. All even numbers end with 0
 * 2. All odd numbers end with 1
 * 3. For a given number (n) in binary number, after discarding digit at unit position, the resulting binary is n/2 as int
 *
 */


class CountingBits {

  def countBits(num: Int): Array[Int] = {

    @scala.annotation.tailrec
    def go(given: Int, current: Int, acc: Array[Int]): Array[Int] = {
      if (current > given) acc
      else {
        acc(current) = acc(current / 2) + {
          if (current % 2 == 0) 0 else 1
        }
        go(given, current + 1, acc)
      }
    }

    num match {
      case 0 => Array(0)
      case 1 => Array(0, 1)
      case _ =>
        val acc: Array[Int] = Array.fill(num + 1)(0)
        acc(1) = 1
        go(num, 2, acc)
    }

  }

}

object CountingBits {

  def main(args: Array[String]): Unit = {

    println(f"1. All even numbers end with 0")
    println(f"2. All odd numbers end with 1")
    println(f"3. For a given number (n) in binary number, after discarding digit at unit position, the resulting binary is n/2 as int")
    val n: Int = 15

    for (i <- 0 to n) {
      println(f"$i%-2s has ${i.toBinaryString.toCharArray.count(_ == '1')} in  ${i.toBinaryString.toInt}%04d")
    }
  }
}
