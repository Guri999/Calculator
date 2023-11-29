package com.example.test

class AddOperation: AbstractOperation() {
    override fun calculator(x: Double, y: Double): Double {
        val answer = x + y

        return answer
    }
}