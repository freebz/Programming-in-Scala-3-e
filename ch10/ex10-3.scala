// 리스트 10.3  Element의 서브클래스인 ArrayElement 정의

class ArrayElement(conts: Array[String]) extends Element {
  def contents: Array[String] = conts
}
