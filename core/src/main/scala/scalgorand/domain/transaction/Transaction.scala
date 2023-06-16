/*
 * Copyright (c) 2022 the scalgorand contributors.
 * See the project homepage at: https://boniface.github.io/scalgorand/
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class Transaction(
  amt: BigInt,
  fee: BigInt,
  fv: BigInt,
  from: Option[String],
  fromRewards: Option[BigInt],
  gen: String,
  gh: String,
  lv: BigInt,
  note: String,
  payment: Option[PaymentTransactionType],
  poolError: Option[String],
  round: Option[BigInt],
  tx: Option[String],
  createdAssets: Option[BigInt],
  @jsonField("type") txtype: String,
  snd: Option[String],
  rcv: Option[String],
  xaid: Option[BigInt],
  aamt: Option[BigInt],
  asnd: Option[String],
  arcv: Option[String],
  aclose: Option[String],
  fadd: Option[String],
  faid: Option[String],
  afrz: Option[Boolean],
  apaa: Option[List[Array[Byte]]]
  )

object Transaction {
  private type JsonEntity = Transaction
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}