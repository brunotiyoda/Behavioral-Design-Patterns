package chain.of.responsibility

import model.Budget

interface Discount {
    fun calculate(budget: Budget): Double?
}