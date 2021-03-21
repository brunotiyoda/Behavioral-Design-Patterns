package chain.of.responsibility

import model.Budget

class NoDiscount : BaseDiscount() {

    override fun calculate(budget: Budget): Double {
        return 0.0
    }
}