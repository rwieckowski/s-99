package pl.rawie.s99

package object p04 {
  def length(xs: List[Any]): Int = xs.foldLeft(0)((n,_) => n + 1)
}
