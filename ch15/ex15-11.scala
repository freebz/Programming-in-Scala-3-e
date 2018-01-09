// 리스트 15.11  타입 지정 패턴을 사용한 패턴 매치

def generalSize(x: Any) = x match {
  case s: String => s.length
  case m: Map[_, _] => m.size
  case _ => -1
}
