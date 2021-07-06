package xplore.learnings.hackerrank

class CircularArrayRotation {

  def circularArrayRotation(a: Array[Int], k: Int, queries: Array[Int]): Array[Int] = {
    val r = k % a.length

    /**
     * 1. a.length - r will give the starting index in unrotated array if it was rotated k times
     * 2. after finding start position, add query index.
     * 3. it is possible that (start + query) exceeds length of array. Just % on length of array.
     */
    queries.map( q => {
      a( (a.length - r + q)   % a.length )
    })
  }
}
