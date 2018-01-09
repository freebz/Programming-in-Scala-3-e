// 리스트 29.14  SimpleFoods 트레이트

trait SimpleFoods {
  object Pear extends Food("Pear")

  def allFoods = List(Apple, Pear)
  def allCategories = Nil
}
