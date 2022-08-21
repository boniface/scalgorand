package scalgorand.testdata

import zio.test.magnolia.DeriveGen
import zio.test.magnolia.DeriveGen.instance
import zio.test.{Gen, ZIOSpecDefault}

import java.time.LocalDateTime

trait DataTest extends ZIOSpecDefault {
  implicit val genLocalDateTime: DeriveGen[LocalDateTime] = instance(Gen.localDateTime.map(_ => LocalDateTime.now()))
  implicit val genArbitraryString: DeriveGen[String]      = instance(Gen.alphaNumericStringBounded(3, 8))
  implicit val genArbitraryInt: DeriveGen[Int]            = instance(Gen.int(1, 10))
  implicit val genBigDecimal: DeriveGen[BigDecimal]       = instance(
    Gen.bigDecimal(
      BigDecimal(Double.MinValue) * BigDecimal(Double.MaxValue),
      BigDecimal(Double.MaxValue) * BigDecimal(Double.MaxValue),
    ),
  )
}
