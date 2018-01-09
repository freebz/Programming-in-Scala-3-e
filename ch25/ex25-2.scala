// 리스트 25.2  TraversableLike 안의 filter 구현

package scala.collection

trait TraversableLike[+Elem, +Repr] {
  def newBuilder: Builder[Elem, Repr]
  def foreach[U](f: Elem => U)
    ...
  def filter(p: Elem => Boolean): Repr = {
    val b = newBuilder
    foreach { elem => if (p(elme)) b += elem }
    b.result
  }
}
