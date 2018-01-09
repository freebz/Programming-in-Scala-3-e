// 리스트 30.2  canEqual을 호출하는 서브클래스 equals 메소드

class ColoredPoint(x: Int, y: Int, val color: Color.Value)
    extends Point(x, y) {

  override def hashCode = (super.hashCode, color).##
  override def equals(other: Any) = other match {
    case that: ColoredPoint =>
      (that canEqual this) &&
      super.equals(that) && this.color == that.color
    case _ =>
      false
  }
  override def canEqual(other: Any) =
    other.isInstanceOf[ColoredPoint]
}
