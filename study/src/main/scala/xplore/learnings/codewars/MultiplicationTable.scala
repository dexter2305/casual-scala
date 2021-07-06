package xplore.learnings.codewars


/**
 * Your task, is to create NxN multiplication table, of size provided in parameter.
 *
 * for example, when given size is 3:
 *
 * 1 2 3
 * 2 4 6
 * 3 6 9
 *
 * for given example, the return value should be: [[1,2,3],[2,4,6],[3,6,9]]
 */
class MultiplicationTable {
  def multiplicationTable(size: Int): List[List[Int]] = {
    (for (c <- 1 to size) yield (1 to size).map(_ * c).toList).toList
  }
}

object MultiplicationTable extends App {

  val n = 3
  val x = for (c <- 1 to n) yield (1 to n).map(_ * c).toList
  println(s"$x")

  //even better one-liner
  val y = List.tabulate(n, n)((x, y) => x + 1 *  y + 1)
  println(s"$y")
}
