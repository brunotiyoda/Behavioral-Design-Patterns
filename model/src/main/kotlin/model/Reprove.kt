package model

class Reprove : StatusBudget() {

    override fun finished(budget: Budget): Budget {
        return budget.copy(mount = budget.mount, status = Finished())
    }
}
