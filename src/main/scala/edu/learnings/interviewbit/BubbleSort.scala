package edu.learnings.interviewbit

import scala.annotation.tailrec

/**
 * Approach
 *
 * - Compare two elements, keep adding smaller one of two to the 'pool' while the larger one remains in 'input'.
 * - Continue until only the largest remains in the 'input' and rest moved to 'pool.
 * - Add largest (only element in 'input') to 'sorted'.
 * - Continue with 'pool' as 'input' until 'pool' is empty.
 *
 */
class BubbleSort {

  def sort(numbers: List[Int]): List[Int] = {
    @tailrec
    def bubble(input: List[Int], pool: List[Int], sorted: List[Int]): List[Int] = {
      println(s" *** {input:${input mkString " "}}  {pool:${pool mkString " "}} {sorted:${sorted mkString (" ")}}")
      input match {
        case x :: Nil =>
          if (pool.isEmpty) x :: sorted
          else bubble(pool, Nil, x :: sorted)
        case a :: b :: remains =>
          if (a > b) bubble(a :: remains, b :: pool, sorted)
          else bubble(b :: remains, a :: pool, sorted)
        case Nil => sorted
      }
    }

    bubble(numbers, Nil, Nil)
  }
}

object BubbleSort {
  def apply(numbers: List[Int]): List[Int] = {
    new BubbleSort().sort(numbers)
  }

  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(7,3, 2, 4, 1)
    println(BubbleSort(list) mkString " ")
  }
}
