// 리스트 12.10  쌓을 수 있는 변경 트레이트 Incrementing, Filtering

trait Incrementing extends IntQueue {
  abstract override def put(x: Int) = { super.put(x + 1) }
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int) = {
    if (x >= 0) super.put(x)
  }
}
