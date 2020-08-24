package edu.learnings.hackerrank


import edu.learnings.BaseSuite

class SockMerchantSuite extends BaseSuite {

  test("10 10 10 has 1 pair") {
    assertResult(1)(SockMerchant.sockMerchant(3, Array(10, 10, 10)))
  }

  test("1 1 2 2 has 2 pairs") {
    assertResult(2)(SockMerchant.sockMerchant(4, Array(1, 1, 2, 2)))
  }

  test("1 3 2 4 has 0 pairs") {
    assertResult(0)(SockMerchant.sockMerchant(4, Array(1, 4, 2, 3)))
  }

  test("no input returns 0 pairs") {
    assertResult(0)(SockMerchant.sockMerchant(0, Array()))
  }

}
