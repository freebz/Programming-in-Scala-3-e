// 리스트 26.7  StringOps 안에 있는 r 메소드 정의

package scala.runtime
import scala.util.matching.Regex

class StringOps(self: String) ... {
  ...
  def r = new Regex(self)
}
