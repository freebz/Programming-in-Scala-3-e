// 리스트 3.6  변경 가능한 집합을 만들고, 초기화하고, 사용하기

import scala.collection.mutable

val movieSet = mutable.Set("Hitch", "Poltergeist")
movieSet += "Shrek"
print(movieSet)
