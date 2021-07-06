package xplore.learnings.codewars

/**
 * The main idea is to count all the occurring characters in a string. If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
 *
 * What if the string is empty? Then the result should be empty object literal, {}.
 */
class CountCharactersInString {
  def count(string: String): Map[Char,Int] = {
    // Implement me! :)
    //val x = string.toList.groupBy(id => id).map(tuple => (tuple._1, tuple._2.size))
    val x  = string.toList.groupBy(identity).view.mapValues(_.size).toMap
    println(s"$x")
    x
  }
}

object CountCharactersInString extends App {
  val instance = new CountCharactersInString
  instance.count("aba")
}
