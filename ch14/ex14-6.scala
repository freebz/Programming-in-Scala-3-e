// 리스트 14.6  개발 참여자 사이의 통신을 원할하게 하기 위해 테스트 사용하기

import org.scalatest._

class TVSetSpec extends FeatureSpec with GivenWhenThen {

  feature("TV power button") {
    scenario("User presses power button when TV is off") {
      Given("a TV set that is switched off")
      When("the power button is pressed")
      Then("the TV should switch on")
      pending
    }
  }
}
