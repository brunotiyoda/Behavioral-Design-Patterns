package domain

import model.Budget
import model.Order

fun main() {

    val handle = HandlerOrder(listOf(GenerateInvoice(), SendEmail()))
    val budget = Budget(mount = 1000.0, quantity = 10, status = NoDiscount())
    handle.handleOrder(
        order = Order(budget = budget, quantity = budget.quantity)
    )

}