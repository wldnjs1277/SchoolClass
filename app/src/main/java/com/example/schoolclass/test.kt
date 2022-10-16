package com.example.schoolclass

fun main(){

}
fun solution(numbers: IntArray): Double {
    var answer: Double = 0.0
    for(i in 0..numbers.size){
        answer=numbers.average()
    }
    return answer
}

