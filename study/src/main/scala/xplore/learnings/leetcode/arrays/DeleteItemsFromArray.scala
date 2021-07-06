package xplore.learnings.leetcode.arrays

object DeleteItemsFromArray extends App {
  def removeElement(nums: Array[Int], `tbd`: Int): Int = {

    @scala.annotation.tailrec
    def go(a: Array[Int], l: Int, r: Int, s: Int): Int = {
      //print(s"'${a.mkString(" ")}' with ($l, $r) => ")
      if (l < r) {
        if (a(l) == s) {
          a(r) match {
            case `s` => println(s"${a.mkString(" ")}")
              go(a, l, r - 1, s)
            case _ => a(l) = a(r)
              a(r) = s
              //println(s"${a.mkString(" ")}")
              go(a, l + 1, r - 1, s)
          }
        } else {
          //println(s"${a.mkString(" ")}")
          go(a, l + 1, r, s)
        }
      } else if (a(l) == s) l - 1 else l
    }
    if (nums.length == 0) 0
    else 1 + go(nums, 0, nums.length - 1, tbd)
  }

  assert(removeElement(Array(3, 2, 2, 3), 2) == 2)
}
