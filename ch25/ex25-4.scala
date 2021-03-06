// 리스트 25.4  CanBuildFrom 트레이트

package scala.collection.generic

trait CanBuildFrom[-From, -Elem, +To] {
  // 새로운 빌더를 만든다.
  def apply(from: From): Builder[Elem, To]
}
