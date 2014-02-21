package pl.rawie.s99

import scala.annotation.tailrec

package object p06 {
  def isPalindrome[T](xs: List[T]): Boolean = {
    @tailrec
    def loop(xs: List[T], ys: List[T]): Boolean = (xs, ys) match {
      case (as, bs) if as == bs => true
      case (a :: as, bs) if as == bs => true
      case (a :: as, bs) => loop(as, a :: bs)
    }
    loop(xs, Nil)
  }

  /*
  http://aperiodic.net/phil/scala/s-99/p06.scala
  ```
  def isPalindrome[T](xs: List[T]): Boolean = xs == xs.reverse
  ```
   */
}
