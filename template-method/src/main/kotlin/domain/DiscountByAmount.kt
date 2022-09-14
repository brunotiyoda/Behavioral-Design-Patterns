package domain

import model.Budget

class DiscountByAmount(
    hasDiscount: Discount? = null
) : BaseDiscount(hasDiscount) {

    override fun performCalculation(budget: Budget): Double {
        return budget.mount * 0.05
    }

    override fun mustApply(budget: Budget): Boolean {
        return budget.mount > 500.0
    }
}