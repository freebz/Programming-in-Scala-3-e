// 리스트 7.7  for 표현식에 여러 개의 필터 적용하기

val filesHere = (new java.io.File(".")).listFiles

for (
  file <- filesHere
  if file.isFile
  if file.getName.endsWith(".scala")
) println(file)
