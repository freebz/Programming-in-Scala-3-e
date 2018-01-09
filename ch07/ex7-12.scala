// 리스트 7.12  스칼라로 작성한 try-finally 절

import java.io.FileReader

val file = new FileReader("input.txt")
try {
  // 파일을 사용하고 닫는다.
} finally {
  file.close()  // 파일을 확실히 닫는다.
}
