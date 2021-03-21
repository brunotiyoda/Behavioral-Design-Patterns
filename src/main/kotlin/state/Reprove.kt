package state

import model.Budget

class Reprove : StatusBudget() {

    override fun finished(budget: Budget): Budget {
        return budget.copy(mount = budget.mount, status = Finished())
    }
}
