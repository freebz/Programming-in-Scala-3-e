// 리스트 33.5  의미 있는 결과를 반환하는 완전한 JSON 파서

import scala.util.parsing.combinator._

class JSON1 extends JavaTokenParsers {

  def obj: Parser[Map[String, Any]] =
    "{"~> repsep(member, ",") <~"}" ^^ (Map() ++ _)

  def arr: Parser[List[Any]] =
    "["~> repsep(value, ",") <~"]"

  def member: Parser[(String, Any)] =
    stringLiteral~":"~value ^^
      { case name~":"~value => (name, value) }

  def value: Parser[Any] = (
        obj
      | arr
      | stringLiteral
      | floatingPointNumber ^^ (_.toDouble)
      | "null ^^ (x => null)
      | "true" ^^ (x => true)
      | "false" ^^ (x => false)
  )
}
