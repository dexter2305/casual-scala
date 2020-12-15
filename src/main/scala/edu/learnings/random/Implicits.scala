package edu.learnings.random

object Implicits {

  def main(args: Array[String]): Unit = {
    ???
  }

  def implicitVariables(): Unit = {

    def helper(implicit message: String): Unit = println(s"$message")
    /**
     * case 1 >>>>>t ls
     * implicitly defined 'mymessage' will be used as parameter in call to helper
     * notice no param is explicitly passed, hence implicit
     */
    implicit val myMessage: String = "just to log"
    val myAnotherMessage = "another message"
    helper

    /**
     * case 2 >>>>>
     * without or ambiguous definition of implicit val/var - call to methods with implicit params will fail
     */
    //helper

  }
}
