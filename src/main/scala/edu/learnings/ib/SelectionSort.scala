package edu.learnings.ib

object SelectionSort {

  def main(args: Array[String]): Unit = {
    val l = List(1, 3, 2, 3, 4)
    println(s"${sort(l)}")
  }

  /**
   *
   * FP style - not an in-place implementation
   *
   * Find min of 'input' list, add to head of acc
   * Repeat until input is Nil
   *
   * @param numbers
   * @return
   */
  def sort(numbers: List[Int]): List[Int] = {
    def helper(input: List[Int], acc: List[Int]): List[Int] = {
      println(s"input:[${input.mkString(",")}]  acc:[${acc.mkString(",")}] ")
      input match {
        case Nil => acc.reverse
        case _ => {
          helper(filterOutFirst(input, input.min), input.min +: acc)
        }
      }
    }

    helper(numbers, List[Int]())
  }

  def filterOutFirst(numbers: List[Int], n: Int): List[Int] = {
    def helper(input: List[Int], acc: List[Int]): List[Int] = {
      input match {
        case Nil => acc
        case head :: tail =>
          if (head == n) helper(List.empty,  acc ::: tail)
          else helper(tail, head +: acc)
      }
    }

    helper(numbers, List[Int]())
  }

}


