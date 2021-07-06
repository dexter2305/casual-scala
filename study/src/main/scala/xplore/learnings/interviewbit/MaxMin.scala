package xplore.learnings.interviewbit

/**
 * Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
 * NOTE: You should make minimum number of comparisons.
 */
object MaxMin {
  def solve(arr: Array[Int]): Int = {
    val l = arr.toList
    val head = l.head
    val (min, max) = l.tail.foldLeft((head, head))((pair, e) => {
      if (e < pair._1) (e, pair._2)
      else if (e > pair._2) (pair._1, e)
      else pair
    })
    min + max
  }
}
