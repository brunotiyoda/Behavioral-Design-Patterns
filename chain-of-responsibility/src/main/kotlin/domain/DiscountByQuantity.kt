package domain

import model.Budget

class DiscountByQuantity(
    nextDiscount: Discount? = null
) : BaseDiscount(nextDiscount) {

    override fun calculate(budget: Budget): Double? {
        if (budget.quantity != null && budget.quantity > 5) {
            return budget.mount * 0.1
        }
        return super.calculate(budget)
    }
}