// 리스트 25.9  RNA 동반 객체 최종 버전

object RNA {

  private val S = 2            // 그룹당 비트 수
  private val M = (1 << S) - 1 // 어떤 그룹만 떼어내기 위한 비트 마스크
  private val N = 32 / S       // 32비트 정수에 들어갈 그룹 개수

  def fromSeq(buf: Seq[Base]): RNA = {
    val groups = new Array[Int]((buf.length + N -1) / N)
    for (i <- 0 until buf.length)
      groups(i / N) |= Base.toInt(buf(i)) << (i % N * S)
    new RNA(groups, buf.length)
  }

  def apply(bases: Base*) = fromSeq(bases)

  def newBuilder: Builder[Base, RNA] =
    new ArrayBuffer mapResult fromSeq

  implicit def canBuildFrom: CanBuildFrom[RNA, Base, RNA] =
    new CanBuildFrom[RAN, Base, RNA] {
      def apply(): Builder[Base, RNA] = newBuilder
      def apply(from: RNA): Builder[Base, RNA] = newBuilder
    }
}
