package Chapter3

import java.util.*

/*숙지해야할 단어
1. 확장함수 : 자기가 원하는 기능을 가진 함수를 클래스에 추가시키는 기능
2. 중위함수 : 변수와 변수사이에 함수를 넣어 연산자 처럼 사용하는 것
3. 디스트럭쳐링(구조 분해) : 객체가 가지고 있는 여러 값을 분해해서 여러 변수에 한꺼번에 초기화할 수 있습니다.
 */

fun main(){
//    val strings :List<String> = listOf("first","second","fourteenth")
//    println(strings.last())
//    val numbers : Collection<Int> = setOf(1,14,2)
//    println(numbers.maxOrNull())

//    val map = mapOf(1 to "one",7 to "seven",53 to "fifty-three")
//    val (number,name) = 1 to "one"
//    for ((index,element) in .withIndex()){
//        println("$index : $element")
//    }

//    println("12.345-6.A".split("\\.|-".toRegex()))

    parsePath2("/Users/yole/lotlin-book/chapter.adoc")
}

fun parsePath(path : String){
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir : $directory, Name : $fileName, ext : $extension")
}

fun parsePath2(path: String){
    val regax = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regax.matchEntire(path)
    if (matchResult != null){
        val (directory, filename, extension) = matchResult.destructured
        println("Dir : $directory, Name : $filename, ext : $extension")
    }
}

infix fun Any.to(other:Any) = Pair(this,other)