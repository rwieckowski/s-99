package pl.rawie.s99.p06

import pl.rawie.s99.UnitSpec

class P06Spec extends UnitSpec {
  "isPalindrome" should "find out whether a list is a palindrome" in {
    isPalindrome(List(1, 2, 3, 2, 1)) should be(true)
  }

  it should "return true for empty list" in {
    isPalindrome(Nil) should be(true)
  }

  it should "return true for single element list" in {
    isPalindrome(List(1)) should be(true)
  }
}
