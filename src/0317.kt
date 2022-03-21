//import java.awt.Color
//
//fun getMnemonic(color : Color){
//    when(color){
//        Color.RED -> "Richard"
//        Color.ORANGE -> "of"
//        Color.YELLOW -> "York"
//        Color.GREEN -> "Gave"
//        Color.BLUE -> "Battle"
//    }
//}
//fun main(){
//    println(getMnemonic(Color.RED))
//}

interface Expr

class Num(val value :Int) :Expr
class  Sum (val left : Expr, val right :Expr) : Expr

fun eval(e:Expr): Int =
    if (e is Num){
        e.value
    }
    else if(e is Sum){
        eval(e.right) + eval(e.left)
    }
    else {
        throw IllegalAccessException("Unknown expression")
    }


fun main(){
    println(eval(Sum(Sum(Num(1),Num(2)),Num(4))))
}