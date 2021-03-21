package observer

import model.Order

class HandlerOrder(
    private val actions: List<Action>
) {

    fun handleOrder(order: Order) {
        println(order)
        actions.forEach { action -> action.execute(order) }
    }
}