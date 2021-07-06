package xplore.learnings.leetcode.linkedlists

object NumberOfSmallerNumbersThanCurrent {

  def smallerNumbersThanCurrent(numbers: Array[Int]): Array[Int] = {
    val frequency = Array.fill[Int](numbers.max + 1)(0)
    for (n <- numbers) {
      frequency(n) = frequency(n) + 1
    }
    val reference = frequency.scanLeft(0)((a, e) => a + e).tail
    val result = for (n <- numbers) yield {
      if (n == 0) 0 else reference(n - 1)
    }
    result
  }
}
