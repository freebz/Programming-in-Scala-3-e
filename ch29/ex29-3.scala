// 리스트 29.3  테스트에 사용할 Food와 Recipe 예제

package org.stairwaybook.recipe

object Apple extends Food("Apple")
object Orange extends Food("Orange")
object Cream extends Food("Cream")
object Sugar extends Food("Sugar")

object FruitSalad extends Recipe(
  "furit salad",
  List(Apple, Orange, Cream, Sugar),
  "Stir it all together."
)
