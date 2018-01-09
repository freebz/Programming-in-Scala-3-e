// 리스트 19.2  private를 사용해 주 생성자 숨기기

class Queue[T] private (
  private val leading: List[T],
  private val trailing: List[T]
)
