package model

class Approve : StatusBudget() {

    override fun finished(budget: Budget): Budget {
        return budget.copy(status = Finished())
    }
}
