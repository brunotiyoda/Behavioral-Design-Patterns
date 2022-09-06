package domain

import model.Budget

class ISS : Tax {
    override fun calculate(budget: Budget): Double {
        return budget.mount * 0.1
    }
}