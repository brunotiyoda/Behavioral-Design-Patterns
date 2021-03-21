package observer

import model.Order

class SendEmail : Action {

    override fun execute(order: Order) {
        println("E-mail sent!")
    }
}