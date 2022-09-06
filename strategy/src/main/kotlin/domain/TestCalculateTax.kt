package strategy

import model.Budget

fun main() {
    println(CalculateTax().calculate(Budget(1000.0), ISS()))
    println(CalculateTax().calculate(Budget(1000.0), ICMS()))
}