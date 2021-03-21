package chain.of.responsibility

import model.Budget

class CalculateDiscount {

    fun calculate(budget: Budget): Double? {
        return DiscountByAmount(DiscountByQuantity(NoDiscount())).calculate(budget)
    }

}