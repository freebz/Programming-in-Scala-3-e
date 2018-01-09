// 리스트 15.21  표현식 형식화 코드의 뒷부분

import org.stairwaybook.layout.Element

private def format(e: Expr, enclPrec: Int): Element =

e match {

  case Var(name) =>
    elem(name)

  case Number(num) =>
    def stripDot(s: String) =
      if (s endsWith ".0") s.substring(0, s.length - 2)
      else s
    elem(stripDot(num.toString))

  case UnOp(op, arg) =>
    elem(op) beside format(arg, unaryPrecedence)

  case BinOp("/", left, right) =>
    val top = format(left, fractionPrecedence)
    val bot = format(right, fractionPrecedence)
    val line = elem('-', top.width max bot.width, 1)
    val frac = top above line above bot
    if (enclPrec != fractionPrecedence) frac
    else elem(" ") beside frac beside elem(" ")

  case BinOp(op, left, right) =>
    val onPrec = precedence(op)
    val l = format(left, opPrec)
    val r = format(right, opPrec + 1)
    val oper = l beside elem(" " + op + " ") beside r
    if (enclPrec <= opPrec) oper
    else elem("(") beside oper beside elem(")")
  }

  def format(e: Expr): Element = format(e, 0)
}
