package xplore.learnings.codewars

/**
 * #codewars
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 *
 * Note: If the number is a multiple of both 3 and 5, only count it once. Also, if a number is negative, return 0(for languages that do have them)
 */
class SumOfMultiplesOf3Or5 {

  def sumOfMultiplesOf3Or5(n: Int): Long = {
    if (n < 0) -1
    else {
      val x = (0 until n).foldLeft(0L)((acc, e) => if (e % 3 == 0 || e % 5 == 0) {
        println(e)
        acc + e
      } else acc)
      println(x)
      x
    }
  }
}
