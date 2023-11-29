package com.example.test

class DivideOperation: AbstractOperation() {
    override fun calculator (x:Double, y:Double): Double {
        val answer = x / y

        println("${answer}")
        return answer
    }
}