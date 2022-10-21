package state

import model.Budget

fun main() {

    val noDiscount = Budget(mount = 1000.0)
    println(noDiscount)
    println(noDiscount.underAnalysis())
    println(noDiscount.underAnalysis()?.approve())
    println(noDiscount.underAnalysis()?.approve()?.finished())

    println()

    val noDiscount2 = Budget(mount = 1000.0)
    println(noDiscount2)
    println(noDiscount2.underAnalysis())
    println(noDiscount2.underAnalysis()?.reprove())
    println(noDiscount2.underAnalysis()?.reprove()?.finished())

    println()

    val noDiscount3 = Budget(mount = 1000.0)
    println(noDiscount3)
    println(noDiscount3.finished())
}
