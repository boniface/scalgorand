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

package scalgorand.domain.node

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class Status(
  catchpoint: Option[String],
  @jsonField("catchpoint-acquired-blocks") catchPointAcquiredBlocks: Option[Long],
  @jsonField("catchpoint-processed-accounts") catchPointProcessedAccounts: Option[Long],
  @jsonField("catchpoint-total-accounts") catchPointTotalAccounts: Option[Long],
  @jsonField("catchpoint-verified-accounts") catchPointVerifiedAccounts: Option[Long],
  @jsonField("catchup-time") catchUpTime: Long,
  @jsonField("last-catchpoint") lastCatchPoint: Option[String],
  @jsonField("last-round") lastRound: BigInt,
  @jsonField("last-version") lastVersion: String,
  @jsonField("next-version") nextVersion: String,
  @jsonField("next-version-round") nextVersionRound: Long,
  @jsonField("next-version-supported") nextVersionSupported: Boolean,
  @jsonField("stopped-at-unsupported-round") stoppedAtUnsupportedRound: Boolean,
  @jsonField("time-since-last-round") timeSinceLastRound: Long
)

object Status {
  private type JsonEntity = Status
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
