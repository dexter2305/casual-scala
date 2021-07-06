package xplore.learnings.leetcode.binarytree

object PostOrderTraversal {

  /*
           1
         /  \
        2     3
       /  \    \
      4    5     6

   */

  def postorderTraversal(root: TreeNode): List[Int] = {
    root match {
      case null => Nil
      case node =>
        postorderTraversal(node.left) ++ postorderTraversal(node.right) ++ List(node.value)
    }
  }
}
