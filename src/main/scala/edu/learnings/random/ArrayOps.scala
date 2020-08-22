package edu.learnings.random

object ArrayOps {

  def main(args: Array[String]): Unit = {
    val nums: Array[Int] = Array()
    println(nums.splitAt(removeDuplicates(nums))._1.mkString(" "))
  }

  def removeDuplicates(nums: Array[Int]): Int = {

    if (nums.length ==0 ) 0
    else {
      var pUnique = 0
      for (i <- 1 until nums.length) {
        println(s"${nums(i)} vs ${nums(pUnique)}")
        if (nums(i) != nums(pUnique)) {
          pUnique = pUnique + 1
          nums(pUnique) = nums(i)
        }
      }
      pUnique + 1
    }
  }
}
