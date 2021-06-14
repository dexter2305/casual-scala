package xplore.learnings.leetcode.contests

object MinOpsToMakeArrayIncreasing extends App {

  val n = Array(1, 5, 2, 4, 1)
  val ans = minOperations(n)
  println(s"$ans")

  def minOperations(nums: Array[Int]): Int = {
    println(s"processing: ${nums.mkString("-")}")
    val initialOps = 0
    val (_, ops) = nums.tail.foldLeft((nums.head, initialOps))((t, e) => {
      val n = if (e <= t._1) {
        val d = t._1 - e + 1
        val r = (e + d, t._2 + d)
        r
      } else {
        (e, t._2)
      }
      println(s"$n")
      n
    })
    ops
  }
}
