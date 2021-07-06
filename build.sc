import scalalib._ 
import mill._

object study extends SbtModule {
  def scalaVersion = "2.13.5"
  object test extends Tests with TestModule.ScalaTest {
    def ivyDeps = Agg(
      ivy"org.scalatest::scalatest:3.2.2"
    )
  }
}