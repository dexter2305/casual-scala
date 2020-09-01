package edu.learnings.leetcode

class MaxConsecutiveOnes {

  def findMaxConsecutiveOnes(arr: Array[Int]): Int = {
    val (runningValue, max) = arr.foldLeft((0, 0))((tuple, e) => e match {
      case 1 => (tuple._1 + 1, tuple._2)
      case 0 =>
        println(s"${arr.mkString(" ")} for $tuple")
        if (tuple._1 > tuple._2) (0, tuple._1) else (0, tuple._2)
    })
    Math.max(runningValue, max)
  }
}
