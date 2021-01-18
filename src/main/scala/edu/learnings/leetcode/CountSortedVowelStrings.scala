package edu.learnings.leetcode

/**
Given an integer n, return the number of strings of length n that consist only of vowels (a, e, i, o, u) and are lexicographically sorted.
A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.

Approach

 n | a - e - i - o - u
 1 | 1   1   1   1   1
 2 | 5   4   3   2   1
 3 | 15  10  6   3   1



 */
class CountSortedVowelStrings {

  def countVowelStrings(n: Int): Int = {

    val out: Array[Int] = Array.fill[Int](5)(1)
    for (i <- 1 until n;
         j <- 3 to 0 by -1) {
      out(j) = out(j) + out(j + 1)
      //println(s"at i: $i & ${out.mkString(" ")}")
    }
    out.sum
  }
}

object CountSortedVowelStrings {

  def main(args: Array[String]): Unit = {
    val i = new CountSortedVowelStrings
    i.countVowelStrings(2)
  }
}
