package xplore.learnings.interviewbit

import xplore.learnings.BaseFlatSpec

class VerifyPrimeSpec extends BaseFlatSpec {
  val i = new VerifyPrime

  "1 & 0" should "0 (false) - not prime" in {
    i.isPrime(1) shouldBe 0
    i.isPrime(0) shouldBe 0
  }

  "2 " should "1 (true) - is a prime" in {
    i.isPrime(2) shouldBe 1
  }

  "7 " should "1 (true)" in {
    i.isPrime(7) shouldBe 1
  }

}
