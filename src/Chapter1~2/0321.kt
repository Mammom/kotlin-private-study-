package `Chapter1~2`

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun main(){
//    val list = arrayListOf("10","11","1001")
//    for ((index,element) in list.withIndex()){
//        println("$index : $element")
//    }

//    val perventage =
//        if (number in 0..100)
//            number
//        else
//            throw IllegalAccessException("...")

    val reader = BufferedReader(StringReader("not a number"))
    readNumber(reader)
}

//fun `Chapter1~2`.readNumber(reader : BufferedReader){
//    val number =try{
//        Integer.parseInt(reader.readLine())
//    }catch (e:NumberFormatException){
//        return
//    }
//    println(number)
//}   //값이 넘어지오지않음

fun readNumber(reader : BufferedReader){
    val number =try{
        Integer.parseInt(reader.readLine())
    }catch (e:NumberFormatException){
        null
    }
    println(number)
}   // 값이 정상적으로 넘어감