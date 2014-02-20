package pl.rawie.s99.p04

import pl.rawie.s99.UnitSpec

class P04Spec extends UnitSpec {
  import pl.rawie.s99._

  "length" should "find the number of elements of a list" in {
    p04.length(List(1, 1, 2, 3, 5, 8)) should equal(6)
  }

  it should "return zero for an empty list" in {
    p04.length(Nil) should equal(0)
  }
}
