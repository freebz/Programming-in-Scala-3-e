// 리스트 7.5  for 표현식으로 디렉토리 내 파일의 목록 구하기

val filesHere = (new java.io.File(".")).listFiles

for (file <- filesHere)
  println(file)
