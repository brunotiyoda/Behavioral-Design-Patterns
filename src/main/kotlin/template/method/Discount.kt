package template.method

import model.Budget

interface Discount {
    fun calculate(budget: Budget): Double?
}