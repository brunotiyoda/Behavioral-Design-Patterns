package domain

import model.Order

interface Action {

    fun execute(order: Order)
}