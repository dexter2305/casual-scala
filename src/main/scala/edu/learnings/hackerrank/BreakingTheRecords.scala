package edu.learnings.hackerrank

class BreakingTheRecords {

  def breakingRecords(scores: Array[Int]): Array[Int] = {

    @scala.annotation.tailrec
    def helper(scoreList: List[Int], curMin: Int, curMax: Int, minCounter: Int = 0, maxCounter: Int = 0): Array[Int] = {
      scoreList match {
        case Nil => Array(maxCounter, minCounter)
        case values => if (values.head < curMin) helper(scoreList.tail, values.head, curMax, minCounter + 1, maxCounter)
        else if (values.head > curMax) helper(scoreList.tail, curMin, values.head, minCounter, maxCounter + 1)
        else helper(scoreList.tail, curMin, curMax, minCounter, maxCounter)
      }
    }
    helper(scores.tail.toList, scores.head, scores.head)
  }

}

object BreakingTheRecords {

  def main(args: Array[String]): Unit = {
    val breakingTheRecords = new BreakingTheRecords
    breakingTheRecords.breakingRecords(Array(10, 5, 20, 20, 4, 5, 2, 25, 1))
  }
}
