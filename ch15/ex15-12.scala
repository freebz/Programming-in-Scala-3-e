// 리스트 15.12  isInstanceOf와 asInstanceOf 사용(좋지 않은 스타일)

if (x.isInstanceOf[String]) {
  val s = x.asInstanceOf[String]
  s.length
} else ...
