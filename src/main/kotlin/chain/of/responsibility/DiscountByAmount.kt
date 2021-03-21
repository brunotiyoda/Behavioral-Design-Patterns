package chain.of.responsibility

import model.Budget

class DiscountByAmount(
    hasDiscount: Discount? = null
) : BaseDiscount(hasDiscount) {

    override fun calculate(budget: Budget): Double? {
        if (budget.mount > 500.0) {
            return budget.mount * 0.05
        }
        return super.calculate(budget)
    }
}