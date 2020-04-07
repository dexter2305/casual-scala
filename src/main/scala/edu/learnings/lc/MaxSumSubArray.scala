
package edu.learnings.lc

object MaxSumSubArray {
  def main(args: Array[String]): Unit = {
    println(maxSubArray(Array(-4, 6, -3, 5)))
    //println(maxSubArray(Array(-1)))
  }


  def maxSubArray(array: Array[Int]): Int = {
    if (array.length == 1) return array(0)
    println(array.mkString(" "))
    println(array.length)
    var maxSum = array(0)
    for (start <- 0 until array.length) {
      println("$start")
      var runningSum = array(start)
      var cont = true
      for (i <- start until array.length; if cont == true) {
        if (array(i) + runningSum > runningSum) {
          runningSum = array(i) + runningSum
        } else {
          cont = false
        }
        println(s"$start - $i = $runningSum")
      }
      if (runningSum > maxSum) maxSum = runningSum
    }
    maxSum
  }
}