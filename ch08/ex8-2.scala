// 리스트 8.2  processLine 지역 함수를 포함하는 LongLines

import scala.io.Source

object LongLines {

  def processFile(filename: String, width: Int) = {

    def processLine(line: String) = {
      if (line.length > width)
        println(filename + ": " + line.trim)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)
  }
}
