// 리스트 35.3  renderComponent 메소드가 있는 스프레드시트

package org.stairwaybook.scells
import swing._

class Spreadsheet(val height: Int, val width: Int)
    extends ScrollPane {

  val cellModel = new Model(height, width)
  import cellModel._

  val table = new Table(height, width) {

    // 예전과 마찬가지로 설정한다.

    override def renderComponent(isSelected: Boolean,
      hasFocus: Boolean, row: Int, column: Int): Component =

    if (hasFocus) new TextField(userData(row, column))
    else
      new Label(cells(row)(column).toString) {
        xAlignment = Alignment.Right
      }

    def userData(row: Int, column: Int): String = {
      val v = this(row, column)
      if (v == null) "" else v.toString
    }
  }

  // 나머지는 예전과 같다.

}
