package scalgorand.infrastracture

sealed trait InfrastructureError
object InfrastructureError{
  final case class GeneralAPIError(error: Throwable)  extends InfrastructureError {}

}
