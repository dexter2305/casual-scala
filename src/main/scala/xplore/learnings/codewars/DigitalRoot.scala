package xplore.learnings.codewars

class DigitalRoot {

  @scala.annotation.tailrec
  final def digitalRoot(n: Int): Int = {
    if (n < 10) n
    else {
      digitalRoot(n.toString.map(_.asDigit).sum)
    }
  }
}
