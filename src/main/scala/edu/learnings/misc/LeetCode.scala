package edu.learnings

object LeetCode {

  def main(args: Array[String]): Unit = {


  }



  def lc977_squaresOfSortedArray(numbers: Array[Int]): Array[Int] = {
    numbers.map(n => n * n).sortWith((x, y) => x < y)
  }

  def reverseInteger(n: Int): Int = {

    def toIntArray(n: Int): Array[Int] = {
      def helper(n: Int, ints: Array[Int]): Array[Int] = {
        if (n < 10) {
          n +: ints
        } else {
          helper(n / 10, (n % 10) +: ints)
        }
      }

      helper(n, Array.emptyIntArray)
    }

    def invert(numbers: Array[Int]): Int = {
      def helper(numbers: Array[Int], index: Int, acc: Int): Int = {
        index == numbers.length - 1 match {
          case true => acc + numbers(index) * Math.pow(10, index).toInt
          case false => helper(numbers, index + 1, acc + numbers(index) * Math.pow(10, index).toInt)
        }
      }
      helper(numbers, 0, 0)
    }

    if (n > Integer.MAX_VALUE) 0
    n > 0 match {
      case true => invert(toIntArray(Math.abs(n)))
      case false => -1 * invert(toIntArray(Math.abs(n)))
    }

  }

  def numbersWithSumAs0(n: Int): Array[Int] = {

    n % 2 == 0 match {
      case false => (-(n - (n + 1) / 2) to (n - (n + 1) / 2)).toArray
      case true => (-(n - n / 2) to -1).toArray ++ (1 to (n - n / 2)).toArray

    }

  }

  def countOfNWithEvenNumberOfDigits(nums: Array[Int]): Int = {
    @scala.annotation.tailrec
    def digitCount(n: Long, count: Int = 0): Int = {
      n match {
        case 0 => count + (if (n % 10 > 0) 1 else 0)
        case _ => digitCount(n / 10, count + 1)
      }
    }
    nums.count(n => digitCount(n) % 2 == 0)
  }

  def getDecimalValueUsingString(head: ListNode): Int = {
    @scala.annotation.tailrec
    def helper(node: ListNode, acc: String): String = {
      if (node == null) {
        println(s"returning $acc")
        acc
      } else {
        println(acc)
        helper(node.next, acc + node._x)
      }
    }

    Integer.parseInt(helper(head, ""), 2)
  }

  def getDecimalValUsingInt(head: ListNode): Int = {

    def size(head: ListNode): Int = {
      @scala.annotation.tailrec
      def count(node: ListNode, c: Int): Int = {
        node match {
          case node if (node == null) => c
          case _ => count(node.next, c + 1)
        }
      }
      count(head, 0)
    }

    @scala.annotation.tailrec
    def asInt(node: ListNode, high: Int, acc: Int): Int = {
      if (null == node) {
        acc
      } else {
        asInt(node.next, high - 1, acc + (node._x * Math.pow(2, high).toInt))
      }

    }
    asInt(head, size(head) - 1, 0)
  }

}

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}
