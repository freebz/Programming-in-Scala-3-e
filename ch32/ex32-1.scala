// 리스트 32.1  퓨처 단언문을 스칼라테스트에게 반환하기

import org.scalatest.AsyncFunSpec
import scala.concurrent.Future

class AddSpec extends AsyncFunSpec {

  def addSoon(addends: Int*): Future[Int] =
    Future { addends.sum }

  describe("addSoon") {
    it("will eventually compute a sum of passed Ints") {
      val futureSum: Future[Int] = addSoon(1, 2)
      // 단언문을 Future에 대해 매핑할 수 있다. 그 후 결과로
      // 나오는 Future[Assertion]을 스칼라테스트에게 보낸다.
      futureSum map { sum => assert(sum == 3) }
    }
  }
}
