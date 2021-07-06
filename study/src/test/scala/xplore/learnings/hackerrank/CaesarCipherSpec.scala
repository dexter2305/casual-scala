package xplore.learnings.hackerrank

import xplore.learnings.BaseFlatSpec

class CaesarCipherSpec extends BaseFlatSpec {

  val i = new CaesarCipher
  "a with rotate 1" should "be b" in {
    i.caesarCipher("a", 1) shouldBe "b"
  }

  "z with rotate 1" should "be a" in {
    i.caesarCipher("z", 1) shouldBe "a"
  }

  "A with rotate 1" should "be B" in {
    i.caesarCipher("A", 1) shouldBe "B"
  }

  "Z with rotate 1" should "be A" in {
    i.caesarCipher("A", 1) shouldBe "B"
  }

  "z with rotate 27" should "be a" in {
    i.caesarCipher("z", 27) shouldBe "a"
  }
}
