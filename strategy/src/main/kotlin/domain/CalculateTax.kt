package domain

import model.Budget

class CalculateTax {
    fun calculate(budget: Budget, tax: Tax): Double {
        return tax.calculate(budget)
    }
}
