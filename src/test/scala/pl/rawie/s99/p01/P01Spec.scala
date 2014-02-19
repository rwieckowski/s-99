package pl.rawie.s99.p01

import pl.rawie.s99.UnitSpec

class P01Spec extends UnitSpec {
  "last" should "find the last element of a list" in {
    last(List(1, 1, 2, 3, 5, 8)) should equal(8)
  }

  it should "throw NoSuchElementException for an empty list" in {
    evaluating {
      last(Nil)
    } should produce [NoSuchElementException]
  }
}
