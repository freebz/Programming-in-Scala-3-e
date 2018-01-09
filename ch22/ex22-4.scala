// 리스트 22.4  List 클래스의 ::: 메소드 정의

def :::[U >: T](prefix: List[U]): List[U] =
  if (prefix.isEmpty) this
  else prefix.head :: prefix.tail ::: this
