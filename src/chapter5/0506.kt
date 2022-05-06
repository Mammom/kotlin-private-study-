package chapter5

import java.net.CacheResponse

fun main(){
    val sum = { x: Int, y:Int ->
        println("Computing the sum of $x and $y...")
        x+y
    }

    println(sum(1,2))

    val errors = listOf("403 Forbidden","404 Not Found")
    printMessagesWithPrefix(errors,"Error : ")

    val responses = listOf("200 ok","418 I'm a teapot","500 Internal Server Error")
    printProblemCounts(responses)
}

fun printMessagesWithPrefix(messages:Collection<String>,prefix:String){
    messages.forEach {  // 각원소에 대해 수행할 작업을 람다로 받는다.
        println("$prefix $it") // 람다 안에서 함수의 "prefix" 파라미터를 사용한다.
    }
}

fun printProblemCounts(responses: Collection<String>){
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach{
        if (it.startsWith("4")){
            clientErrors++
        }else if (it.startsWith("5")){
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

// 바운드 멤버 참조 -> 멤버 참조를 생성할때 클래스 인스턴스를 함께 저장한 다음 나중에 그 인스턴스에 대해 멤버를 호출
// 해준다. 따라서 호출 시 수신 대항 객체 를 별도로 지정해 줄 필요가 없다.