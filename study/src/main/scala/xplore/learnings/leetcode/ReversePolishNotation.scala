package xplore.learnings.leetcode


object ReversePolishNotation extends App {

  val expr = Array("2", "-1", "+", "+3", "*")
  println(evalRPN(expr))

  def evalRPN(tokens: Array[String]): Int = {
    val stack = new scala.collection.mutable.Stack[Int]()
    for (e <- tokens) {
      e match {
        case t: String if t.matches("[-+]?[0-9]+") => stack.push(t.toInt)
        case operator: String =>
          val r = stack.pop()
          val l = stack.pop()
          operator match {
            case "+" => stack.push(l + r)
            case "*" => stack.push(l * r)
            case "-" => stack.push(l - r)
            case "/" => stack.push(l / r)
          }
      }
    }
    stack.pop()
  }

}
