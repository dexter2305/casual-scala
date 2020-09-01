package edu.learnings.leetcode

object DominantIndex {

  def main(args: Array[String]): Unit = {
    dominantIndex(Array(1, 1, 1, 1))
  }

  def dominantIndex(nums: Array[Int]): Int = {
    nums.length match {
      case 0 => -1
      case _ =>
        val maxVal = nums.distinct.max
        val indexOfMax = nums.indexOf(maxVal)
        val conflictedVal = nums.filter(e => e != maxVal).find(e => maxVal < 2 * e)
        val returnIndex = if (conflictedVal.isDefined) -1 else indexOfMax
        println(s"${nums.mkString(" ")}")
        println(s"maxVal:$maxVal indexOfMax:$indexOfMax with return:$returnIndex")
        returnIndex

    }
  }
}
