package observer

import model.Order

class GenerateInvoice : Action {

    override fun execute(order: Order) {
        println("Invoice generated!")
    }
}