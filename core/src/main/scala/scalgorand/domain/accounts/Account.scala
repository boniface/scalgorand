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

package scalgorand.domain.accounts

import scalgorand.domain.application.{Application, ApplicationLocalState, ApplicationStateSchema}
import scalgorand.domain.asset.Asset
import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}


case class Account (
  description: Option[String],
  participation: Option[AccountParticipation],
  amount: BigInt,
  address: String,
  @jsonField("created-at-round") createdAtRound: Option[BigInt],
  @jsonField("apps-local-state") appsLocalState: Option[List[ApplicationLocalState]],
  @jsonField("created-assets") createdAssets: Option[List[Asset]],
  @jsonField("apps-total-schema") appsTotalSchema: Option[ApplicationStateSchema],
  asset: Option[AssetHolding],
  @jsonField("reward-base ") rewardsBase: Option[BigInt],
  @jsonField("pending-rewards") pendingRewards: BigInt,
  @jsonField("created-apps") createdApps: Option[List[Application]],
  @jsonField("total-assets-opted-in") totalAssetsOptedIn: Int,
  @jsonField("total-apps-opted-in") totalAppsOptedIn: Int,
  @jsonField("closed-at-round") closedAtRound: Option[BigInt],
  @jsonField("total-created-apps") totalCreatedApps: Int,
  deleted: Option[Boolean],
  @jsonField("amount-without-pending-rewards") amountWithoutPendingRewards: Option[BigInt],
  @jsonField("auth-addr") authAddress: Option[String],
  rewards: BigInt,
  status: String,
  @jsonField("sig-type") sigType: Option[String]
 )

object Account {
  private type JsonEntity = Account
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
