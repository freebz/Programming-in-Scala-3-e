// 리스트 26.3  UpperCase 문자열 익스트랙터 객체

object UpperCase {
  def unapply(s: String): Boolean = s.toUpperCase == s
}
