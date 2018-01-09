// 리스트 4.1  ChecksumAccumulator 최종 버전

// ChecksumAccumulator.scala 파일에 저장
class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}
