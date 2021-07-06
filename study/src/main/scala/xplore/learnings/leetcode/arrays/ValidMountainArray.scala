package xplore.learnings.leetcode.arrays

object ValidMountainArray extends App {

  val l = Array(2,1)
  assert(validMountainArray(l))


  def validMountainArray(arr: Array[Int]): Boolean = {

    @scala.annotation.tailrec def up(n: Array[Int], p: Int): Int = {
      if (p + 1 < n.length) {
        if (n(p + 1) > n(p)) up(n, p + 1) else {
          println(s"up till ${n(p)} in ${n.mkString(" ")}")
          p
        }
      } else n.length
    }

    @scala.annotation.tailrec
    def down(n: Array[Int], p: Int): Int = {

      if (p + 1 < n.length) {
        if (n(p) > n(p + 1)) down(n, p + 1) else {
          println(s"down till ${n(p)} in ${n.mkString(" ")}")
          p
        }
      } else {
        n.length
      }
    }


    val l = up(arr, 0) match {
      case x if x == arr.length || x == 0 => false
      case x => down(arr, x)
    }

    if (l == arr.length) true else false
  }

}
