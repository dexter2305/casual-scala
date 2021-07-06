package xplore.learnings.hackerrank

object JumpingOnClouds {

  def main(args: Array[String]): Unit = {
    jumpingOnClouds(Array(0, 0, 1, 0, 0, 1, 0))
  }

  def jumpingOnClouds(c: Array[Int]): Int = {
    @scala.annotation.tailrec
    def helper(cs: List[Int], jumps: Int): Int = {
      cs match {
        case _ :: _ :: y :: rest if y == 0 => helper(y +: rest, jumps + 1)
        case _ :: x :: y :: rest if y == 1 => helper(x :: y +: rest, jumps + 1)
        case 0 :: 0 :: Nil => jumps + 1
        case 0 :: Nil => jumps
      }
    }
    helper(c.toList, 0)
  }

}
