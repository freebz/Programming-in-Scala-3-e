// 리스트 25.3  TraversableLike의 map 구현

def map[B, That](f: Elem => B)
    (implicit bf: CanBuildFrom[Repr, That, This]): That = {
  val b = bf(this)
  for (x <- this) b += f(x)
  b.result
}
