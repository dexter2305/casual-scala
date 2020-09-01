package edu.learnings.leetcode

object BackSpaceStringCompare {

  def main(args: Array[String]): Unit = {
    backspaceString("abc#d")
  }

  def backspaceCompare(S: String, T: String): Boolean = {
    backspaceString(S) equals backspaceString(T)
  }

  def backspaceString(input: String): String = {
    input.foldLeft("")((acc:String, e:Char) => {
      val output = e match {
        case '#' => if (acc.length > 0) acc.substring(0, acc.length - 1) else acc
        case _ => acc + e
      }
      output
    })
  }
}

