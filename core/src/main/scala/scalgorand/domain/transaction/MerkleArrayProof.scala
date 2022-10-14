package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class MerkleArrayProof (
  path: Option[List[String]],
  @jsonField("hash-factory") hashFactory: Option[HashFactory],
  @jsonField("tree-depth") treeDepth: Option[Int]
)

object MerkleArrayProof {
  private type JsonEntity = MerkleArrayProof
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
