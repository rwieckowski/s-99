package pl.rawie.s99.p02

import pl.rawie.s99.UnitSpec

class P02Spec extends UnitSpec {
  "penultimate" should "find the last but one element of a list" in {
    penultimate(List(1, 1, 2, 3, 5, 8)) should equal(5)
  }

  it should "throw NoSuchElementException for a list with less that two elements" in {
    evaluating {
      penultimate(List(1))
    } should produce [NoSuchElementException]
  }
}
