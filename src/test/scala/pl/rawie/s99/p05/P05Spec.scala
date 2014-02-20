package pl.rawie.s99.p05

import pl.rawie.s99.UnitSpec

class P05Spec extends UnitSpec {
  "reverse" should "reverse a list" in {
    reverse(List(1, 1, 2, 3, 5, 8)) should equal(List(8, 5, 3, 2, 1, 1))
  }
}
