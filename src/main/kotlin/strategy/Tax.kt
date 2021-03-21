package strategy

import model.Budget

interface Tax {
    fun calculate(budget: Budget): Double
}