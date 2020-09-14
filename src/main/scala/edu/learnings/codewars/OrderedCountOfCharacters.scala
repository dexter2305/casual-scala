package edu.learnings.codewars

import scala.collection.immutable.ListMap


class OrderedCountOfCharacters {
  def orderedCount(chars: String): List[(Char, Int)] = {
    val lm = chars.toCharArray.foldLeft(ListMap[Char, Int]())((acc, e) => {
      if (acc.contains(e)) {
        acc + (e -> (acc(e) + 1))
      }
      else acc + (e -> 1)
    })
    val result = lm.toList
    //println(result)
    result
  }
}
