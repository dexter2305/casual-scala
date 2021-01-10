package edu.learnings.interviewbit

class VerifyPrime {
  def isPrime(A: Int): Int = {

    A match {
      case 0 | 1 => 0
      case 2 => 1
      case _ => val sqrt = Math.sqrt(A).toInt + 1
        if (!(2 to sqrt).exists(A % _ == 0)) 1 else 0
    }
  }

}
