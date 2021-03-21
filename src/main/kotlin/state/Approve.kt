package state

import model.Budget

class Approve : StatusBudget() {

    override fun finished(budget: Budget): Budget {
        return budget.copy(status = Finished())
    }
}
