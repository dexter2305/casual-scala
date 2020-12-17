package edu.learnings.codewars

import scala.annotation.tailrec

class PileOfCubes {


  def findNb(m: Long): Int = {
    val sumOfCubes: Int => Double = n => math.pow(n * (n + 1) / 2, 2)
    @scala.annotation.tailrec
    def helper(n: Long, value: Int): Int = {
      val x = sumOfCubes(value)
      if (n > x) helper(n, value + 1)
      else if (n == x) value
      else -1
    }
    helper(m, value = 0)
  }
}

object PileOfCubes {

  def main(args: Array[String]): Unit = {

    //println(s"${largestSumOfCubesAsInt()}")
    val pileOfCubes = new PileOfCubes
    println(s"${pileOfCubes.findNb(37)}")

  }

  def largestSumOfCubesAsInt(): Int = {
    val sumOfCubes: Int => Double = (n: Int) => {
      math.pow(n * (n + 1) / 2, 2)
    }

    @tailrec
    def helper(value: Int = 1): Int = {
      val sumOfCubesForValue = sumOfCubes(value)
      if (Int.MaxValue >= sumOfCubesForValue) {
        println(s"soc($value) => $sumOfCubesForValue <= ${Int.MaxValue}")
        helper(value + 1)
      } else {
        println(s"*** soc($value) => $sumOfCubesForValue > ${Int.MaxValue}")
        value - 1
      }
    }

    helper()
  }
}
