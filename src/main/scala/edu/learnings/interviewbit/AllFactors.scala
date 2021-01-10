package edu.learnings.interviewbit


class AllFactors {
  def allFactors(A: Int): Array[Int] = {

    @scala.annotation.tailrec
    def helper(n: Int, current: Int, acc: List[Int]): List[Int] = {
      if (current > math.sqrt(n)) acc
      else if (n % current == 0) {
        val a = n / current
        val b = n / a

        if (a != b) helper(n, current + 1, acc :+ a :+ b)
        else helper(n, current + 1, acc :+ a )

      } else helper(n, current + 1, acc)
    }

    helper(A, 1, List.empty[Int]).sorted.toArray

  }

  def allFactorsConciseCode(A: Int): Array[Int] = {

    (for(i <- 1 to math.sqrt(A).toInt if A % i == 0) yield {(i, A / i)})
      .flatMap(t => List(t._1, t._2)).sorted.distinct.toArray

  }
}
