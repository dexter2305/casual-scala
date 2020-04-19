package edu.learnings.lc

object PivotIndex {

  def main(args: Array[String]): Unit = {
    //PivotIndex.pivotIndex(Array(2, 2, -2))
    println(pivotIndex(Array(1, 7, 3, 6, 5, 6)))
  }

  def pivotIndex(nums: Array[Int]): Int = {

    println(s"${nums.mkString(",")}")
    val result = nums.length match {
      case 0 => -1
      case 1 => -1
      case 2 => -1
      case _ => {
        def aux(nums: Array[Int], index: Int, leftSum: Int, sum: Int): Int = {
          index equals nums.length match {
            case true => -1
            case false => {
              val rightSum = sum - leftSum - nums(index)
              println(s"index$index, nums($index):${nums(index)}  total:$sum left :$leftSum right:$rightSum")
              if (leftSum == rightSum) index
              else aux(nums, index + 1, leftSum + nums(index), sum)
            }
          }
        }

        val pivotIndex = aux(nums, 0, 0, nums.sum)
        //val pivotIndex = aux(nums, 1, nums.head, nums.sum)
        pivotIndex
      }
    }
    result
  }

}