package state

import model.Budget

open class StatusBudget {

    open fun underAnalysis(budget: Budget): Budget {
        throw IllegalStateException("Discount under Analysis")
    }

    open fun approve(budget: Budget): Budget {
        throw IllegalStateException("Can't be approved")
    }

    open fun reprove(budget: Budget): Budget {
        throw IllegalStateException("Can't be reproved")
    }

    open fun finished(budget: Budget): Budget {
        throw IllegalStateException("Can't be finished")
    }

}