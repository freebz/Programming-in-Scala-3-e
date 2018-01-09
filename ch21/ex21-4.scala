// 리스트 21.4  암시적 파라미터를 내부에서 사용하는 함수

def maxList[T](elements: List[T])
      (implicit ordering: Ordering[T]): T =
  elements match {
    case List() =>
      throw new IllegalArgumentException("empty list!")
    case List(x) => x
    case x :: rest =>
      val maxRest = maxList(rest)
      if (ordering.gt(x, maxRest)) x
      else maxRest
  }
