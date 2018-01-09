// 리스트 19.5  무공변성(융통성이 없는) Cell 클래스

class Cell[T](init: T) {
  private[this] var current = init
  def get = current
  def set(x: T) = { current = x }
}
