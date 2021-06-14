package xplore.learnings.leetcode

object GroupAnagrams {
  def main(args: Array[String]): Unit = {
    anagramsOf(Array("eat", "tea", "tan", "ate", "nat", "bat"))
  }

  def anagramsOf(array: Array[String]): List[List[String]] = {
    val group: Map[String, Array[String]] = array.groupBy(e => e.toLowerCase().toSeq.sorted.unwrap)
    group.values.map(e => e.toList).toList
  }
}
