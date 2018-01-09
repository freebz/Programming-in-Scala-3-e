// 리스트 8.4  두 디폴트 인자를 가진 함수

def printTime2(out: java.io.PrintStream = Console.out,
  divisor: Int = 1) =
  out.println("time = " + System.currentTimeMillis()/divisor)
