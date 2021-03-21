package chain.of.responsibility

import model.Budget

fun main() {
    println(CalculateDiscount().calculate(Budget(mount = 400.0, quantity = 4)))
    println(CalculateDiscount().calculate(Budget(mount = 400.0, quantity = 6)))
    println(CalculateDiscount().calculate(Budget(mount = 600.0, quantity = 4)))
}