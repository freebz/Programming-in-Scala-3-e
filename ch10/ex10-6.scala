// 리스트 10.6  슈퍼클래스의 생성자 호출

class LineElement(s: String) extends ArrayElement(Array(s)) {
  override def width = s.length
  override def height = 1
}
