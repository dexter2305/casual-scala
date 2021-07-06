package xplore.learnings.leetcode.strings

object SplitStringInBalancedString {

  def balancedStringSplit(s: String): Int = {
    val (splitCounter, _) = s.foldLeft((0, 0))((t, e) => {
      t match {
        case (counter, rv) => e match {
          case 'R' => if (rv + 1 == 0) (counter + 1, 0) else (counter, rv + 1)
          case 'L' => if (rv - 1 == 0) (counter + 1, 0) else (counter, rv - 1)
        }
      }

      /*
      (t, e) match {
        case ((counter, rv), 'R') => if (rv + 1 == 0) (counter + 1, 0) else (counter, rv + 1)
        case ((counter, rv), 'L') => if (rv - 1 == 0) (counter + 1, 0) else (counter, rv - 1)
      }

       */
    }

    )
    //println(s"$splitCounter")
    splitCounter
  }
}
