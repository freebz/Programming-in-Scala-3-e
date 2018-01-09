// 리스트 25.7  RNA 가닥 클래스의 두 번째 버전

final class RNA2 private (
  val groups: Array[Int],
  val length: Int
) extends IndexedSeq[Base] with IndexedSeqLike[Base, RNA2] {

  import RNA2._

  override def newBuilder: Builder[Base, RNA2] =
    new ArrayBuffer[Base] mapResult fromSeq

  def apply(idx: Int): Base = ... // 예전과 같다.
}
