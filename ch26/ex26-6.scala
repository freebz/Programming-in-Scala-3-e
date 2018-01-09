// 리스트 26-6  unapplySeq 정의가 있는 익스트랙터

package scala
object List {
  def apply[T](elems: T*) = elems.toList
  def unapplySeq[T](x: List[T]): Option[Seq[T]] = Some(x)
  ...
}
