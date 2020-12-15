package edu.learnings.hackerrank

class MigratoryBirds {

  def migratoryBirds(arr: Array[Int]): Int = {
    val result = arr.groupBy(id => id).map(x => (x._1, x._2.length))
      .reduce((x, y) => {
        if (x._2 > y._2) x
        else if (y._2 > x._2) y
        else if (x._1 < y._1) x
        else y
      })
    result._1
  }
}
