package domain

interface IATCMediator {
    val isLandingOk: Boolean
    fun registerRunway(runway: Runway)
    fun registerFlight(flight: Flight)
    fun setLandingStatus(status: Boolean)
}
