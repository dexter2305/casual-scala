package xplore.learnings.leetcode

class SortMatrixDiagonally {

  def diagonalSort(mat: Array[Array[Int]]): Array[Array[Int]] = {
    val diffTuples: Seq[(Int, Int)] = for (r <- mat.indices; c <- mat(r).indices) yield r - c -> mat(r)(c)
    val diffMap: Map[Int, Seq[Int]] = diffTuples.groupMap(t => t._1)(t => t._2)
    var sortedMap: Map[Int, Seq[Int]] = diffMap.map(t => (t._1, t._2.sorted))

    val seqs = for (r <- mat.indices) yield {
      for (c <- mat(r).indices) yield {
        val d = r - c
        val list = sortedMap(d)
        sortedMap = sortedMap - d
        sortedMap = sortedMap + (d -> list.tail)
        list.head
      }
    }
    seqs.map(_.toArray).toArray
  }

}

object SortMatrixDiagonally extends App {

  val i = new SortMatrixDiagonally
  val matrix = i.diagonalSort(Array(Array(3, 3, 1, 1), Array(2, 2, 1, 2), Array(1, 1, 1, 2)))

  println("printing result: ")
  for (i <- matrix.indices) {
    for (j <- matrix(i).indices) {
      print(s"${matrix(i)(j)} ")
    }
    println("")
  }


}
