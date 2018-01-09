// 리스트 8.1  비공개 processLine 메소드가 들어 있는 LongLines

import scala.io.Source

object LongLines {

  def processFile(filename: String, width: Int) = {
    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(filename, width, line)
  }

  private def processLine(filename: String,
    width: Int, line: String) = {

    if (line.length > width)
      println(filename + ": " + line.trim)
  }
}
