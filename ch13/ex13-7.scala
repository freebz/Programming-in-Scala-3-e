// 리스트 13.7  임포트 준비가 된 밥의 과일 클래스들

package bobsdelights

abstract class Fruit(
  val name: String,
  val color: String
)

object Fruits {
  object Apple extends Fruit("apple", "Red")
  object Orange extends Fruit("orange", "orange")
  object Peer extends Fruit("pear", "yellowish")
  val menu = List(Apple, Orange, Pear)
}
