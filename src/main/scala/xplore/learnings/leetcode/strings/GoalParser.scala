package xplore.learnings.leetcode.strings

object GoalParser {
  def interpret(command: String): String = {
    command.replace("()", "o").replace("(al)", "al")
  }
}
