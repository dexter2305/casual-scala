package xplore.learnings.leetcode.arrays

class KidsWithGreatestNumberOfCandies {
  def kidsWithCandies(candies: Array[Int], extraCandies: Int): Array[Boolean] = {
    val m = candies.max
    candies.map( c => (c + extraCandies) >= m)
  }

}
object KidsWithGreatestNumberOfCandies {
  def main(args: Array[String]): Unit = {
    val i = new KidsWithGreatestNumberOfCandies
    i.kidsWithCandies(Array(2,3,4,5,1), 7)
  }
}
