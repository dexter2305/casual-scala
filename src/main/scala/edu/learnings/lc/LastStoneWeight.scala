package edu.learnings.lc

object LastStoneWeight {
  def main(args: Array[String]): Unit = {
    lastStoneWeight(Array(5, 1, 3))
  }

  def lastStoneWeight(stones: Array[Int]): Int = {
    def helper(stones: Array[Int]): Array[Int] = {
      println(s"-> ${stones.mkString("-")}")
      stones.length match {
        case 1 => stones
        case _ => {
          val x = stones(0)
          val y = stones(1)
          helper(stones.slice(2,stones.length).prepended((x - y)).sorted.reverse)
          //helper(stones.slice(2, stones.length).prepended(nonZeroDiff).sorted.reverse)
        }
      }
    }

    val nonZeroDiff:(Int, Int)=>Int = (x: Int, y: Int) => {
      val diff = x - y;
      if (diff > 0) Some(diff) else None
      1
    }
    helper(stones.sorted.reverse)(0)
  }


}
