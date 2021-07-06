package xplore.learnings.leetcode.binarytree


object MaxDepthOfBinaryTree {

  def maxDepthConcise(root: TreeNode): Int = {
    @scala.annotation.tailrec
    def iterate(root: List[TreeNode], acc: Int): Int = root match {
      case Nil => acc
      case _ =>
        val nextLevel = root.flatMap(n => List(Option(n.left), Option(n.right)).flatten)
        iterate(nextLevel, acc + 1)
    }
    if(root == null) 0 else iterate(List(root), 0)
  }

  def maxDepth(root: TreeNode): Int = {
    @scala.annotation.tailrec
    def go(nodes: List[TreeNode], currentDepth: Int): Int = {

      if (nodes.isEmpty) currentDepth
      else {
        val nextLevels = (for (node <- nodes if node != null) yield {
          //println(s"$node")
          (node.left, node.right) match {
            case (null, null) => List.empty
            case (l, null) => List(l)
            case (null, r) => List(r)
            case (l, r) => List(l, r)
          }
        }).flatten

        go(nextLevels, currentDepth + 1)
      }

    }
    if (root == null) 0
    else go(List(root), 0)
  }
}
