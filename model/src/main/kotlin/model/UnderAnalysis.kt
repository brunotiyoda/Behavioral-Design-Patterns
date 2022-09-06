package model

import model.Budget
import model.Reprove
import model.StatusBudget

class UnderAnalysis : StatusBudget() {

    override fun approve(budget: Budget): Budget {
        return budget.copy(mount = budget.mount * 0.02)
    }

    override fun reprove(budget: Budget): Budget {
        return budget.copy(status = Reprove())
    }

}