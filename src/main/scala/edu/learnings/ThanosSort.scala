package edu.learnings

object ThanosSort {

  def main(args: Array[String]) = {
    println(thanosSnap(fetchUserInput(n())))
  }

  def n(): Int = scala.io.StdIn.readInt()

  def fetchUserInput(n: Int): IndexedSeq[Int] = {
    scala.io.StdIn.readLine().split(" ").take(n).map(_.toInt)
  }

  def thanosSnap(seq: IndexedSeq[Int]): Int = {

    def helper(seq: IndexedSeq[Int]): Int = {
      //println(s"Snapping $seq")
      isSorted(seq) match {
        case false => helper(seq.splitAt(seq.length / 2)._1)
        case true => seq.length
      }
    }

    helper(seq)

  }

  def isSorted(seq: IndexedSeq[Int]): Boolean = {

    def helper(seq: IndexedSeq[Int], index: Int): Boolean = {
      if (index == seq.length) true
      else {
        if (seq(index) >= seq(index - 1)) helper(seq, index + 1)
        else false
      }
    }

    helper(seq, 1)

  }

}
