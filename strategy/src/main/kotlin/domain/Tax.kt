package domain

import model.Budget

interface Tax {
    fun calculate(budget: Budget): Double
}