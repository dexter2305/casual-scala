package edu.learnings

case class Animal(breed: String)

case class Vehicle(wheelCount: Int)

object PMMain{
  def main(args: Array[String]) = {
    println(animal(new Animal("dog")).get)
    println(animal(new Vehicle(3)).getOrElse("Not an animal"))
  }

  def animal(instance: Any): Option[Animal] = {
    instance match {
      case animal: Animal => Some(animal)
      case  _ => None
    }
  }


}