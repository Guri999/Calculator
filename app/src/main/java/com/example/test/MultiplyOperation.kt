package com.example.test

class MultiplyOperation: AbstractOperation() {
    override fun calculator (x:Double, y:Double): Double {
        var answer = x * y

        println("${answer}")
        return answer
    }
}