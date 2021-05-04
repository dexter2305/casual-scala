package edu.learnings.leetcode.arrays

object ArrayProblems {

  // https://leetcode.com/problems/create-target-array-in-the-given-order/
  def createTargetArray(nums: Array[Int], index: Array[Int]): Array[Int] = {
    var targetArray = Array[Int]()
    for (i <- index.indices) {
      println(s"insert ${nums(i)} at position ${index(i)} in target array")
      val (l, r) = targetArray.splitAt(index(i))
      targetArray = (l :+ nums(i)) ++ r

    }
    targetArray
  }

  //https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/
  def pivotIndex(nums: Array[Int]): Int = {
    @scala.annotation.tailrec
    def go(numbers: Array[Int], i: Int, lSum: Int, total: Int): Int = {
      i match {
        case index if index < numbers.length => if (lSum == total - numbers(i) - lSum) i
        else go(numbers, i + 1, lSum + numbers(i), total)
        case _ => -1
      }
    }

    go(nums, 0, 0, nums.sum)
  }

  //https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1147/
  def dominantIndex(nums: Array[Int]): Int = {
    @scala.annotation.tailrec
    def maxWithPosition(n: Array[Int], i: Int, max: Int, maxIndex: Int): (Int, Int) = {
      i match {
        case currentIndex if currentIndex < n.length => if (n(currentIndex) > max) maxWithPosition(n, currentIndex + 1, n(currentIndex), currentIndex)
        else maxWithPosition(n, currentIndex + 1, max, maxIndex)
        case _ => (max, maxIndex)
      }
    }

    nums.length match {
      case 0 => -1
      case 1 => 0
      case _ => val (max, position) = maxWithPosition(nums, 1, nums(0), 0)
        nums.filter(_ != max).find(2 * _ > max) match {
          case Some(_) => -1
          case None => position
        }
    }
  }

  //https://leetcode.com/explore/featured/card/may-leetcoding-challenge-2021/598/week-1-may-1st-may-7th/3730/
  def runningSum(nums: Array[Int]): Array[Int] = {
    @scala.annotation.tailrec
    def go(n: Array[Int], i: Int, acc: Array[Int]): Array[Int] = {
      if (i < n.length) {
        i match {
          case index if index == 0 => acc(index) = n(index)
            go(n, i + 1, acc)
          case index => acc(index) = acc(index - 1) + n(index)
            go(n, i + 1, acc)
        }
      } else acc
    }

    go(nums, 0, Array.fill[Int](nums.length)(0))
  }

  //https://leetcode.com/explore/challenge/card/may-leetcoding-challenge-2021/598/week-1-may-1st-may-7th/3731/
  def checkPossibility(nums: Array[Int]): Boolean = {
    var counter = 0
    for (i <- 1 until nums.length) {
      // previous number > current. - either correct previous or this one;
      // since we passed through elements, we can use second previous to make decision about which one to fix; current or previous.
      // if second previous is smaller than current as in...[ 1(i-2), 4(i-1), 2(i)... then correct to [1, **2**, 2.. => changed nums(i -1)
      // if second previous is larger than current as in ...[ 3(i-2), 5(i -1), 2(i)... then correct to [3, 5, **5**, ... => changed nums(i)
      if (nums(i - 1) > nums(i)) {
        if (i < 2 || nums(i - 2) <= nums(i)) {
          nums(i - 1) = nums(i)
        } else {
          nums(i) = nums(i - 1)
        }
        counter += 1
      }
    }
    counter <=1
  }
}
