package edu.learnings.lc

object GroupAnagrams {
  def main(args: Array[String]): Unit = {
//    prettify(anagramsOf(Array("eat", "tea", "tan", "ate", "nat", "bat")))
    anagramsOf(Array("eat", "tea", "tan", "ate", "nat", "bat"))
  }

  //def anagramsOf(array: Array[String]): List[List[String]] = {
  def anagramsOf(array: Array[String]): List[List[String]] = {
    val group:Map[String,Array[String]] = array.groupBy(e => e.toLowerCase().toSeq.sorted.unwrap)
    group.values.map(e => e.toList).toList
  }


}
