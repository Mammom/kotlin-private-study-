package Chapter3


fun main(){
//    val strings = listOf("first","second","fourteenth")
//    println(strings.last())
//    val number = setOf(1,14,2)
//    println(number.maxOrNull())

//    println("Operation performed $opCount times")
//    println("kotlin".lastChar())

//    val view :View = Button()
//    view.click()

    println("Kotlin".lastChar)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)

}
var opCount = 0

fun performOperation(){
    opCount++
}

fun String.lastChar() : Char = get(length-1)

open class View{
    open fun click() = println("view clicked")
}
class Button : View(){
    override fun click() = println("Button clicked")
}

val String.lastChar: Char
    get()= get(length -1)

var StringBuilder.lastChar : Char
    get() = get(length -1)
    set(value : Char){
        this.setCharAt(length-1,value)
    }

//확장함수는 오버라이드 할수 없다.

