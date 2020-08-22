package edu.learnings.random

import scala.annotation.tailrec

object PeekElement {

  def main(args: Array[String]): Unit = {
    println("findpeakelement: " + findPeakElementWithMatch(Array(1, 2, 3, 4, 6, 2, 3, 4)))
    println("findMin-reduce:" + findMin(Array(78,91,123,2,9,5,1,6,23,10)))
  }

  def findPeakElementWithMatch(nums: Array[Int]): Int = {
    @tailrec
    def helper(curIndex: Int, maxIndex: Int): Int = {
      curIndex match {
        case curIndex if curIndex == nums.length => maxIndex
        case _ => helper(curIndex + 1, if (nums(curIndex) > nums(maxIndex)) curIndex else maxIndex)
      }
    }

    helper(0, 0)
  }

  def findMin(numbers: Array[Int]): Int = {
    numbers.reduceLeft((x: Int, y: Int) => Math.min(x, y))
  }
}
