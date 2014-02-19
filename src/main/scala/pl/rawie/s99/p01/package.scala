package pl.rawie.s99

import scala.annotation.tailrec

package object p01 {
  @tailrec
  def last[T](xs: List[T]): T = xs match {
    case x :: Nil => x
    case x :: tail => last(tail)
    case Nil => throw new NoSuchElementException
  }
}
