package xplore.learnings.leetcode

class KLengthApart {


  def kLengthApart(nums: Array[Int], k: Int): Boolean = {

    @scala.annotation.tailrec
    def go(n: Array[Int], k: Int, index: Int, lastKnown: Option[Int] = None): Boolean = {

      if (index == n.length) true
      else {
        //print(s"\ne: ${nums(index)}, index: $index, lastKnown: ${lastKnown.toString}")
        if (n(index) != 1) go(n, k, index + 1, lastKnown)
        else lastKnown match {
          case Some(l) if (index - l - 1) < k => false
          case Some(l) if (index - l - 1) >= k =>
            //print(s"diff ${index - l}")
            go(n, k, index + 1, Some(index))
          case None => go(n, k, index + 1, Some(index))
        }
      }
    }

    //println(s"${nums.mkString("-")}")
    go(nums, k, index = 0)
  }
}
