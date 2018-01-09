// 리스트 12.9  new를 이용해 인스턴스를 생성하면서 트레이트 믹스인하기

val queue = new BasicIntQueue with Doubling
// queue: BasicIntQueue with Doubling = $anon$1@33f676f6
queue.put(10)
queue.get()
// res14: Int = 20
