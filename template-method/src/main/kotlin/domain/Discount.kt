package domain

import model.Budget

interface Discount {
    fun calculate(budget: Budget): Double?
}