package domain

import model.Budget

abstract class BaseDiscount(
    private val hasDiscount: Discount? = null
) : Discount {

    override fun calculate(budget: Budget): Double? {
        if (mustApply(budget)) return performCalculation(budget)
        return hasDiscount?.calculate(budget)
    }

    abstract fun performCalculation(budget: Budget): Double?
    abstract fun mustApply(budget: Budget): Boolean
}