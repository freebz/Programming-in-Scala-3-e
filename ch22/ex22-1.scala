// 리스트 22.1  Nil 싱글톤 객체 정의

case object Nil extends List[Nothing] {
  override def isEmpty = true
  def head: Nothing =
    throw new NoSuchElementException("head of empty list")
  def tail: Nothing =
    throw new NoSuchElementException("tail of empty list")
}
