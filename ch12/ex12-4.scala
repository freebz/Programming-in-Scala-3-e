// 리스트 12.4  여러 트레이트의 믹스인

class Animal
trait HasLegs

class Frog extends Animal with Philosophical with HasLegs {
  override def toString = "green"
}
