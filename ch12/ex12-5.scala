// 리스트 12.5  풍부한 트레이트 정의

trait Rectangular {
  def topLeft: Point
  def bottomRIght: Point

  def left = topLeft.x
  def right = bottomRIght.x
  def width = right - left
  // 여러 기하 관련 메소드...
}
