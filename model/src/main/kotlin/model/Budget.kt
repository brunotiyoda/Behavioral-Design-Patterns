package model

data class Budget(
    val mount: Double,
    val quantity: Int? = null,
    val status: StatusBudget? = NoDiscount()
) {

    fun underAnalysis(): Budget? {
        return status?.underAnalysis(this)
    }

    fun approve(): Budget? {
        val approved = status?.approve(this)
        if (approved != null) {
            return copy(mount = mount - approved.mount, status = Approve())
        }
        return approved
    }

    fun reprove(): Budget? {
        return status?.reprove(this)
    }

    fun finished(): Budget? {
        return status?.finished(this)
    }

}