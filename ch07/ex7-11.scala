// 리스트 7.11  스칼라로 작성한 try-catch 절

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

try {
  val f = new FileReader("input.txt")
  // 파일을 사용하고 닫는다.
} catch {
  case ex: FileNotFoundException => // 파일을 못 찾는 경우
  case ex: IOException => // 그 밖의 IO 오류 처리
}
