package edu.learnings.leetcode.binarytree


object LevelOrderTraversal extends App {
  def levelOrder(root: TreeNode): List[List[Int]] = {
    @scala.annotation.tailrec
    def go(current: List[TreeNode], acc: List[List[Int]]): List[List[Int]] = {
      //every pass-through of go accumulates two items
      // 1. List of all values in a particular level of binary tree
      // 2. List of all child nodes in the same level of binary tree. This becomes input to the next recursive call until input becomes empty (visited all child nodes)
      //
      current match {
        case head :: Nil if head == null => /*println("when input is null.. ") ;*/ acc
        case Nil => acc
        case listOfNodes =>
          // aggregate (v to list of child nodes - this is binary tree, child node count can vary from 0-2)
          val aggregation: List[(Int, List[TreeNode])] = (for (node <- listOfNodes)
            yield (node.value, (node.left, node.right)))
            .map {
              case (v, (null, null)) => (v, List.empty)
              case (v, (l, null)) => (v, List(l))
              case (v, (null, r)) => (v, List(r))
              case (v, (l, r)) => (v, List(l, r))
            }
          //println(s"${aggregation.mkString(" ")}")
          val (currentValues, nextLevels) = aggregation.foldLeft((List.empty[Int], List.empty[TreeNode])) {
            case (acc, element) => (acc._1 :+ element._1, acc._2 ::: element._2)
          }

          go(nextLevels, acc.appended(currentValues))
      }
    }

    go(List(root), List.empty)
  }
}
