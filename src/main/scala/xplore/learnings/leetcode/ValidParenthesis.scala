package xplore.learnings.leetcode

class ValidParenthesis {

  def isValid(s: String): Boolean = {

    @scala.annotation.tailrec
    def go(given: String, p: Int, container: List[Char]): Boolean = {
      if (p < given.length)
        given(p) match {
          case l if l.equals('(') || l.equals('{') || l.equals('[') => go(given, p + 1, l +: container)
          case r if r.equals(')') || r.equals('}') || r.equals(']') =>
            container match {
              case '(' :: rest if r.equals(')') => go(given, p + 1, rest)
              case '{' :: rest if r.equals('}') => go(given, p + 1, rest)
              case '[' :: rest if r.equals(']') => go(given, p + 1, rest)
              case _ => false
            }
          case _ => go(given, p + 1, container)
        }
      else container.isEmpty
    }

    go(s, 0, List.empty[Char])
  }
}
