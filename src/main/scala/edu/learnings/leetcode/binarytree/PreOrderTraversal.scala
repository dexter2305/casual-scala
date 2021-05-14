package edu.learnings.leetcode.binarytree

import scala.collection.mutable

object PreOrderTraversal extends App {
  val one = TreeNode(1)
  val two = TreeNode(2)
  val three = TreeNode(3)

  val four = TreeNode(4)
  val five = TreeNode(5)
  val six = TreeNode(6)

  one.left = two
  one.right = three
  two.left = four
  two.right = five
  three.right = six


  def preorderTraversal(root: TreeNode): List[Int] = {
    preOrderTraversalRecursion(root)
  }

  def preOrderTraversalIterative(root: TreeNode): List[Int] = {
    if (root != null) {
      val stack = mutable.Stack[TreeNode]()
      val list: mutable.ListBuffer[Int] = mutable.ListBuffer()
      stack.push(root)
      while (stack.nonEmpty) {
        val e = stack.pop()
        list += e.value
        if (e.right != null) stack.push(e.right)
        if (e.left != null) stack.push(e.left)
      }
      list.toList
    } else {
      List.empty
    }
  }
  /*
          1
        /   \
      2       3
    /   \     / \
  4       5  b    6

    1 +: 2 +: 4 +: 5

   */

  def preOrderTraversalRecursion(root: TreeNode): List[Int] = {

    root match {
      case null => Nil
      case _ =>
        var l: List[Int] = Nil
        l = root.value :: (preOrderTraversalRecursion(root.left) ::: preOrderTraversalRecursion(root.right))
        l
    }
  }
}
