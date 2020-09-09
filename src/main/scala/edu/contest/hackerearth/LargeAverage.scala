
package edu.contest.hackerearth;

object LargeAverage {

  def main(args: Array[String]): Unit = {
    //println(sumOfRange(3,5))
    //println(largeAverage(3,5))
    val n = scala.io.StdIn.readInt
    for (i <- 0 until n) {
      val numbers = scala.io.StdIn.readLine().split(" ").map(c => c.toLong)
      //println(s"(${numbers(0)}, ${numbers(1)}) => ${largeAverage(numbers(0),numbers(1))} => ${largeAverage(numbers(0),numbers(1)).toInt}")
      println(largeAverage(numbers(0), numbers(1)))
    }
  }

  def largeAverage(l: Long, r: Long): Long = {
    //(sumOfRange(l, r) / (l to r).toList.count(x => true)).toInt
    (sumOfRange(l, r) / (r - l + 1)).toLong
  }

  def sumOfRange(l: Long, r: Long): Long = {
    ap(r) - ap(l - 1)
  }

  def ap(n: Long): Long = {
    n * (n + 1) / 2
  }

}