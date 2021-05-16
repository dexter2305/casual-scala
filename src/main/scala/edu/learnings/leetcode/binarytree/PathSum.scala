package edu.learnings.leetcode.binarytree

object PathSum {
  def hasPathSum(root: TreeNode, targetSum: Int): Boolean = {
    if (root == null ) false
    else {
      (root.left, root.right) match {
        case (null, null) => root.value == targetSum
        case (l, null) => hasPathSum(root.left, targetSum - root.value)
        case (null, r) => hasPathSum(root.right, targetSum - root.value)
        case (l, r) => hasPathSum(root.left, targetSum - root.value) || hasPathSum(root.right, targetSum - root.value)
      }
    }
  }
}
