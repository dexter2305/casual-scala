package edu.learnings.leetcode.binarytree

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object InOrderTraversal {

  def inorderTraversal(root: TreeNode): List[Int] = {
    inOrderTraversalRecursion(root)
  }

  def inOrderTraversalRecursion(root: TreeNode): List[Int] = {
    root match {
      case null => Nil
      case node => (inOrderTraversalRecursion(node.left) :+ node.value) ::: inOrderTraversalRecursion(node.right)
    }
  }
}
