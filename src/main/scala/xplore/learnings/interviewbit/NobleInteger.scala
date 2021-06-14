package xplore.learnings.interviewbit

object NobleInteger {
  def main(args: Array[String]): Unit = {
    println(s"${solve(Array(1, 2, 3, 4))}")
  }

  def solve(A: Array[Int]): Int = {


    def helper(n: List[Int], max: Int): Int = {
      n match {
        case head :: tail => {
          println(s"greater than '$head':${max}")
          if (head == max) 1
          else helper(tail, max - 1)
        }
        case _ => -1
      }
    }

    if (A.size == 0) -1
    else {
      val sortedList = A.sorted.distinct.toList
      val greaterThanFirst = sortedList.count(_ > sortedList.head)
      println(s"processing - [${sortedList.mkString(" ")}]")
      helper(sortedList, greaterThanFirst)
    }

  }
}
