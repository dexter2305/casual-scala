package xplore.learnings.leetcode

class MaximumWealth {
  def maximumWealth(accounts: Array[Array[Int]]): Int = {

    accounts.map(_.sum).max
  }
}
