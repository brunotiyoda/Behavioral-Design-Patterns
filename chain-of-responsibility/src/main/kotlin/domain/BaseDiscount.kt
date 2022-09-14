package domain

import model.Budget

abstract class BaseDiscount(
    private val hasDiscount: Discount? = null
) : Discount {

    override fun calculate(budget: Budget): Double? {
        return hasDiscount?.calculate(budget)
    }
}