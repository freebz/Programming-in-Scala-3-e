// 리스트 18.9  BasicCircuitSimulation 클래스의 앞부분

package org.stairwaybook.simulation

abstract class BasicCircuitSimulation extends Simulation {

  def InverterDelay: Int
  def AndGateDelay: Int
  def OrGateDelay: Int

  class Wire {

    private var sigVal = false
    private var actions: List[Action] = List()

    def getSignal = sigVal

    def setSignal(s: Boolean) =
      if (s != sigVal) {
        sigVal = s
        actions foreach (_ ())
      }

    def addAction(a: Action) = {
      actions = a :: actions
      a()
    }
  }

  def inverter(input: Wire, output: Wire) = {

    def invertAction() = {
      val inpugSig = input.getSignal

      afterDelay(InverterDelay) {
        output setSignal !inpugSig
      }
    }
    input addAction invertAction
  }

  // 리스트 18.10에서 계속 이어나감...
  
