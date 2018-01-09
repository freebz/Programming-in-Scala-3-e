// 리스트 20.10  서브클래스에서 추상 타입 구현하기

class Grass extends Food
class Cow extends Animal {
  type SuitableFood = Grass
  override def eat(food: Grass) = {}
}
