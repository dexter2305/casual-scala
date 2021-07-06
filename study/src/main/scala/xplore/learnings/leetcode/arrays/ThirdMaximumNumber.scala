package xplore.learnings.leetcode.arrays

object ThirdMaximumNumber extends App {

  val l = Array(2, 2, 3)
  println(s"${thirdMax(l)}")

  def thirdMax(nums: Array[Int]): Int = {
    @scala.annotation.tailrec
    def go(a: Array[Int], index: Int, counter: Int, currentMax: Int): Option[Int] = {
      //if (index < a.length) {
      counter match {
        case 3 => Some(currentMax)
        case _ => if (index < a.length) {
          if (a(index) == currentMax) go(a, index + 1, counter, currentMax)
          else go(a, index + 1, counter + 1, a(index))
        } else None
      }
    }

    val rSorted = nums.sorted.reverse
    go(rSorted, 0, 1, rSorted.head).getOrElse(rSorted.head)
  }
}
