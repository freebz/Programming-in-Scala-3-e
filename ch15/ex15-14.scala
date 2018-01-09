// 리스트 15.14  패턴 가드가 있는 match 표현식

def simplifyAdd(e: Expr) = e match {
  case BinOp("+", x, y) if x == y =>
    BinOp("*", x, Number)
  case _ => e
}
