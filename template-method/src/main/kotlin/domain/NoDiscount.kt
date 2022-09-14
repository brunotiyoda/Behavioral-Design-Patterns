package domain

import model.Budget

class NoDiscount : BaseDiscount() {

    override fun performCalculation(budget: Budget): Double {
        return 0.0
    }

    override fun mustApply(budget: Budget): Boolean {
        return true
    }
}