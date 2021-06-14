package xplore.learnings.concepts

import xplore.learnings.BaseFlatSpec

class EqualityInScala extends BaseFlatSpec {

  case class Vehicle(brand: String)

  val audi: Vehicle = Vehicle("Audi")
  val anotherAudi: Vehicle = Vehicle("Audi")

  "Value equality |  '==' & 'equals are same.'" should " be true values of two objects are same." in {
    audi == anotherAudi shouldBe audi.equals(anotherAudi)

  }

  it should " be false when two objects have different values" in {
    val duplicateAudi = Vehicle("auudi")
    audi should not equal duplicateAudi
  }

  it should " mean that hashcode of equal valued objects are same" in {
    audi.hashCode() shouldEqual anotherAudi.hashCode()
  }

  "Reference equality. 'Operator used is 'eq' " should "be true if two references are pointing to same instance in heap" in {
    val referringAudi = audi
    audi eq referringAudi shouldBe true
  }

  it should "be false when references point to different instances in heap" in {
    audi eq anotherAudi shouldBe false
  }

  it should "be true for an Array even the contents of the array are modified" in {
    val ints = Array(1, 2, 3)
    val referringToInt = ints
    ints eq referringToInt should be(true)
    ints(0) = 0
    ints eq referringToInt shouldBe true

  }

}
