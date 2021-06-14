package xplore.learnings.hackerrank


class CaesarCipher {


  def caesarCipher(s: String, k: Int): String = {

    val transform: (Char, Int) => Char = (x, k) => {
      if (x.isLetter) {
        val rotate = k % 26
        val pxFormed = x.toInt + rotate
        val asNumber = if (x.isUpper && pxFormed > 'Z'.toInt) pxFormed - 26
        else if (x.isLower && pxFormed > 'z'.toInt) pxFormed - 26
        else pxFormed
        //println(s"$x with rotate: $rotate => $asNumber")
        asNumber.toChar
      } else x
    }
    val res = s.map(transform(_, k))
    res
  }
}
