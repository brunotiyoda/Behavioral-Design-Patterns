package state

import model.Budget

class UnderAnalysis : StatusBudget() {

    override fun approve(budget: Budget): Budget {
        return budget.copy(mount = budget.mount * 0.02)
    }

    override fun reprove(budget: Budget): Budget {
        return budget.copy(status = Reprove())
    }

}