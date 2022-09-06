package model

import java.time.Instant

data class Order(
    val budget: Budget? = null,
    val requestDate: Instant = Instant.now(),
    val quantity: Int? = 0
) {

}