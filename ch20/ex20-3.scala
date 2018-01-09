// 리스트 20.3  추상 var를 게터와 세터로 확장한 모습

trait AbstractTime {
  def hour: Int                // 'hour'의 게터
  def hour_=(x: Int)           // 'hour'의 세터
  def minute: Int              // 'minute'의 게터
  def minute_=(x: Int)         // 'minute'의 세터
}
