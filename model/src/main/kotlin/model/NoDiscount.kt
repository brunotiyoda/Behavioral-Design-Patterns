package model

class NoDiscount : StatusBudget() {

    override fun underAnalysis(budget: Budget): Budget {
        return budget.copy(status = UnderAnalysis())
    }

    override fun approve(budget: Budget): Budget {
        return budget.copy(status = Approve())
    }

    override fun reprove(budget: Budget): Budget {
        return budget.copy(status = Reprove())
    }

    override fun finished(budget: Budget): Budget {
        return budget.copy(status = Finished())
    }
}
