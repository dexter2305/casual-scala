package xplore.learnings.leetcode.arrays

object CheckIfNAndItsDoubleExists extends App {

  println(s"${CheckIfNAndItsDoubleExists.checkIfExist(Array(3,1,7,11))}")


  def checkIfExist(arr: Array[Int]): Boolean = {
    @scala.annotation.tailrec
    def go(nums: Array[Int], index: Int, pc: Set[Double]) : Boolean = {
      if (index < nums.length) {
        if (pc.isEmpty) go (nums, index + 1, pc + nums(index).toDouble)
        else {
          val v:Double = nums(index)
          if (pc.contains(v * 2)) {
            println(s"${pc.mkString(",")} has double of ${nums(index)}")
            true
          }
          else if (pc.contains(v / 2 ) ) {
            println(s"${pc.mkString(",")} has half of ${nums(index)}")
            true
          }
          else go(nums, index + 1, pc + nums(index).toDouble)
        }
      } else {
        println("reached eol. return false")
        false
      }
    }
    go(arr, 0, Set.empty[Double])
  }
}
