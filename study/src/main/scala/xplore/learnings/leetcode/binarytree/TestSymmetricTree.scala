package xplore.learnings.leetcode.binarytree

object TestSymmetricTree {

  def isSymmetric(root: TreeNode): Boolean = {
    def isMirror(left: TreeNode, right: TreeNode): Boolean = {
      (left, right) match {
        case (null, null) => true
        case (null, r) => false
        case (l, null) => false
        case (l, r) => l.value == r.value && isMirror(l.left, r.right) && isMirror(l.right, r.left)
      }
    }
    isMirror(root.left, root.right)
  }
}
