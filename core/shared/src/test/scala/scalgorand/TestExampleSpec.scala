package scalgorand

import scalgorand.container.AlgoTestContainer
import scalgorand.container.AlgoTestContainer.containerLayer
import scalgorand.testdata.DataTest
import zio.ZIO
import zio.test.Assertion.isSome
import zio.test.assert

object TestExampleSpec extends DataTest{
  private val trace: String = s"[${Console.BLUE} TRACE${Console.RESET}]"
  def spec =
    suite(" Test Suite ")(
      test(" Test Application IO") {
        for {
          client <-ZIO.service[AlgoTestContainer].debug(trace)
           hello <-client.getAlgoPort


        } yield

          assert(Some(client.getAlgoPort))(isSome)

      },
    ).provideLayer(containerLayer)
}
