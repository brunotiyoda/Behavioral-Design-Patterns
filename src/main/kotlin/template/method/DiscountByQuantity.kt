package template.method

import model.Budget

class DiscountByQuantity(
    nextDiscount: Discount? = null
) : BaseDiscount(nextDiscount) {

    override fun performCalculation(budget: Budget): Double {
        return budget.mount * 0.1
    }

    override fun mustApply(budget: Budget): Boolean {
        return budget.quantity != null && budget.quantity > 5
    }
}