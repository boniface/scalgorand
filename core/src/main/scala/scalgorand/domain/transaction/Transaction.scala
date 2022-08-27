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

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class Transaction(
  fee: BigInt,
  firstRound: BigInt,
  from: String,
  fromRewards: BigInt,
  genesisId: String,
  genesisHash: Byte,
  lastRound: BigInt,
  noteB64: Byte,
  payment: PaymentTransactionType,
  poolError: String,
  round: BigInt,
  tx: String,
  createdAssets: BigInt,
  txtype: String,
  sender: Option[String],
  xferAssetId: Option[BigInt],
  assetAmount: Option[BigInt],
  assetSender: Option[String],
  assetReciever: Option[String],
  assetCloseTo: Option[String],
  freezeTarget: Option[String],
  assetFreezeId: Option[String],
  assetFreezeState: Option[Boolean],
  applicationArgs: List[Array[Byte]]
  )

object Transaction {
  private type JsonEntity = Transaction
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}