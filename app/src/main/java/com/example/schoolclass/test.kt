package com.example.schoolclass

fun main(){
println(solution(3))
}
    fun solution(num: Int): String {
        var answer = ""
        if(num%2==0){
            answer="Even"
        }else{
            answer="Odd"
        }
        return answer

}


