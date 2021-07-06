package xplore.contest.freshworks

class FindFrequencyInRange {

  def frequencyInRange(input: String, q: Char, limit: Int, patternLength: Int): Int = {

    val pattern = input.slice(0, patternLength)
    val cCountMap: Map[Char, Int] = pattern.toCharArray.groupBy(identity).map(t => (t._1, t._2.length))
    val x: Int = cCountMap.getOrElse(q, 0) * (limit / patternLength)
    val y: Int = pattern.slice(0, limit % patternLength)
      .toCharArray
      .groupBy(id => id)
      .map(t => (t._1, t._2.length))
      .getOrElse(q, 0)

    println(s"pattern: $pattern, dictionary: $cCountMap, x: $x, y: $y")

    x + y
  }

}
