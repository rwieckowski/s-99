package pl.rawie.s99

package object p02 {
  def penultimate[T](xs: List[T]): T = xs match {
    case x :: _ :: Nil => x
    case _ :: ys => penultimate(ys)
    case _ => throw new NoSuchElementException
  }
}
