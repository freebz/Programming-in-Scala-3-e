// 리스트 29.17  싱글톤 타입 사용

object browser extends Browser {
  val database: db.type = db
}
