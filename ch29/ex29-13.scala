// 리스트 29.13  믹스인만 가지고 만든 SimpleDatabase 객체

object SimpleDatabase extends Database
    with SimpleFoods with SimpleRecipes
