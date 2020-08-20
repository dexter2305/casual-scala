package edu.learnings.hackerrank

object DictionariesAndMaps {

  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    val phonebook = (for (_ <- 0 until n)
      yield scala.io.StdIn.readLine().split(" ").take(2)).map(arr => (arr(0), arr(1))).toMap

    @scala.annotation.tailrec
    def search(phonebook: Map[String,String], query: String = ""): Unit = {
      if (query != null && !query.isEmpty) {
        phonebook get query match {
          case Some(result) => println(s"$query=$result")
          case None => println("Not found")
        }
        search(phonebook, scala.io.StdIn.readLine())
      }
    }
    search(phonebook, scala.io.StdIn.readLine())
  }
}
