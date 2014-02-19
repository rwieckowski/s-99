package pl.rawie.s99

package object p03 {
  def nth[T](n: Int, xs: List[T]): T = (n, xs) match {
    case (0, x :: _) => x
    case (m, _ :: ys) => nth(m - 1, ys)
    case _ => throw new NoSuchElementException
  }
}
