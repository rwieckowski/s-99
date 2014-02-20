package pl.rawie.s99

package object p05 {
  def reverse[T](xs: List[T]): List[T] = xs.foldLeft[List[T]](Nil)((ys,x) => x :: ys)
}
