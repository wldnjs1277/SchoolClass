package com.example.schoolclass

fun main(){
println(solution(12))
}
    fun solution(n: Int): Int {
        var answer: Int = 0
        for(x in 1..n) {
            if (n.mod(x) == 1) {
                answer = x
                break
            }
        }
        return answer
    }




