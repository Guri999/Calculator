package com.example.test

fun main() {
    var num1 = 0.0
    num1 = readln()!!.toDouble()

    while (true) {

        var operator = readln()!!.toString()
        if(operator !in setOf("+","-","*","/","%")){
            try {
                num1 = operator.toDouble()
                continue
            }
            catch (e:NumberFormatException){
                println("부호와 숫자로만 적어주세요")
                continue
            }
        }

        try {
            var num2 = readln()!!.toDouble()
            val tools = when (operator) {
                "+" -> AddOperation()
                "-" -> SubstractOperation()
                "*" -> MultiplyOperation()
                "/" -> DivideOperation()
                "%" -> RemainOperation()
                else -> {
                    println("잘못된 연산자 입니다")
                    continue
                }
            }
            num1 = tools.calculator(num1,num2)
            println("${num1}")
        }
        catch (e:NumberFormatException){
            println("부호와 숫자로만 적어주세요")
        }
    }

}