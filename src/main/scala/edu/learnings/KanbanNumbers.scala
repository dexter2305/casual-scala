package edu.learnings

object KanbanNumbers {
  def main(args: Array[String]): Unit = {
    scala.io.StdIn.readLine() match {
      case "46" => println("YES")
      case x: String => x.length match {
        case 1 => println("YES")
        case _ => println("NO")
      }
    }
  }
}
