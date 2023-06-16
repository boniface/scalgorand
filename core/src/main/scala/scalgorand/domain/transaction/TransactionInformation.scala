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

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField, jsonHint}

case class TransactionInformation(
  id: String,
  amt: Option[BigInt],
  fee: BigInt,
  from: Option[String],
  fromRewards: Option[BigInt],
  note: Option[String],
  poolError: Option[String],
  round: Option[BigInt],
  tx: Option[String],
  createdAssets: Option[BigInt],
  sender: String,
  rcv: Option[String],
  xaid: Option[BigInt],
  aamt: Option[BigInt],
  asnd: Option[String],
  arcv: Option[String],
  aclose: Option[String],
  fadd: Option[String],
  faid: Option[String],
  afrz: Option[Boolean],
  apaa: Option[List[Array[Byte]]],
  group: Option[String],
  lease: Option[String],
  logs: Option[List[String]],
  signature: Option[TransactionSignature],
  @jsonField("inner-txns") innerTransactions: Option[List[TransactionInformation]],
  @jsonField("intra-round-offset") innerRoundOffset: Option[BigInt],
  @jsonField("keyreg-transaction") keyRegTransaction: Option[String],
  @jsonField("close-rewards") closeRewards: Option[Int],
  @jsonField("closing-amount") closingAmount: Option[BigInt],
  @jsonField("confirmed-round") confirmedRound: Option[BigInt],
  @jsonField("created-application-index") createdApplicationIndex: Option[Int],
  @jsonField("auth-addr") authAddr: Option[String],
  @jsonField("first-valid") firstValid: Option[BigInt],
  @jsonField("genesis-hash") genesisHash: Option[String],
  @jsonField("genesis-id") genesisId: Option[String],
  @jsonField("last-valid") lastValid: Option[BigInt],
  @jsonField("payment-transaction") payment: Option[TransactionPayment],
  @jsonField("application-transaction") applicationTransaction: Option[TransactionApplication],
  @jsonField("asset-config-transaction") assetConfigTransaction: Option[TransactionAssetConfig],
  @jsonField("asset-freeze-transaction") assetFreezeTransaction: Option[TransactionAssetFreeze],
  @jsonField("asset-transfer-transaction") assetTransferTransaction: Option[TransactionAssetTransfer],
  @jsonField("global-state-delta") globalStateDelta: Option[List[EvalDeltaKeyValue]],
  @jsonField("keyreg-transaction") keyregTransaction: Option[TransactionKeyreg],
  @jsonField("local-state-delta") localStateDelta: Option[List[AccountStateDelta]],
  @jsonField("receiver-rewards") receiverRewards: Option[Int],
  @jsonField("rekey-to") rekeyTo: Option[String],
  @jsonField("round-time") roundTime: Option[BigInt],
  @jsonField("sender-rewards") senderRewards: Option[BigInt],
  @jsonField("state-proof-transaction") stateProofTransaction: Option[TransactionStateProof],
  @jsonField("tx-type") txtype: String
)

object TransactionInformation {
  private type JsonEntity = TransactionInformation
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}