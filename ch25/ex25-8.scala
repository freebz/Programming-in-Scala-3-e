// 리스트 25.8  최종 RNA 가닥 클래스

final class RNA private (val groups: Array[Int], val length: Int)
    extends IndexedSeq[Base] with IndexedSeqLike[Base, RNA] {

  import RNA._

  // 'Indexedseq'에 있는 'newBuilder'를 재구현하는 것은 필수다.
  override protected[this] def newBuilder: Builder[Base, RNA] =
    RNA.newBuilder

  // 'IndexSeq'의 'apply'를 재구현하는 것은 필수다.
  def apply(idx: Int): Base = {
    if (idx < 0 || length <= idx)
      throw new IndexOutOfBoundException
    Base.fromInt(groups(idx / N) >> (idx % N * S) & M)
  }

  // foreach는 재구현을 꼭 해야 하는 것은 아니다.
  // 하지만 더 효율적으로 만들기 위해 재구현한다.
  override def foreach[U](f: Base => U): Unit = {
    var i = 0
    var b = 0
    while (i < length) {
      b = if (i % N == 0) groups(i / N) else b >>> S
      f(Base.fromInt(b & M))
      i += 1
    }
  }
}
