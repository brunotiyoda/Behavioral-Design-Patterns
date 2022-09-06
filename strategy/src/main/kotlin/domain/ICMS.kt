package domain

import model.Budget

class ICMS : Tax {
    override fun calculate(budget: Budget): Double {
        return budget.mount * 0.05
    }
}