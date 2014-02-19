package pl.rawie.s99.p03

import pl.rawie.s99.UnitSpec

class P03Spec extends UnitSpec {
  "nth" should "find the Kth element of a list" in {
    nth(2, List(1, 1, 2, 3, 5, 8)) should equal(2)
  }

  it should "throw NoSuchElementException when n is larger than number of list elements" in {
    evaluating {
      nth(2, List(1))
    } should produce [NoSuchElementException]
  }

  it should "throw NoSuchElementException when n is negative" in {
    evaluating {
      nth(-1, List(1))
    } should produce [NoSuchElementException]
  }
}
