// 리스트 26.4  Domain 문자열 익스트랙터 객체

object Domain {

  // 인젝션 메소드(선택적)
  def apply(parts: String*): String =
    parts.reverse.mkString(".")

  // 익스트랙터 메소드(필수)
  def unapplySeq(whole: String): Option[Seq[String]] =
    Some(whole.split("\\.").reverse)
}
