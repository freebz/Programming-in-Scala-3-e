// 리스트 9.4  빌려주기 패턴을 사용해 파일 쓰기

def withPrintWriter(file: File)(op: PrintWriter => Unit) = {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close()
  }
}
