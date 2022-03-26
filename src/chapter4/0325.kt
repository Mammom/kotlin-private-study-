package chapter4

//class Outer {   //코틀린의 중첩 클래스와 내부클래스의 관계
//    inner class Inner{
//        fun getOuterReference(): Outer = this@Outer
//    }
//}

//interface Expr  //인터페이스 구현을 통해 식 표현
//class Num(val value :Int) : Expr
//class Sum(val left : Expr, val right :Expr) :Expr
//
//fun eval (e : Expr) : Int =
//    when(e){
//        is Num ->e.value
//        is Sum -> eval(e.right)+ eval(e.left)
//        else->
//            throw IllegalAccessException("Unknown expression")
//    }

//sealed class Expr{  //sealed 클래스로 식 표현하기
//    class Num(val value :Int) : Expr()
//    class Sum(val left :Expr,val right: Expr): Expr()
//}
//
//fun eval(e: Expr) :Int =
//    when(e){
//        is Expr.Num -> e.value
//        is Expr.Sum -> eval(e.right)+ eval(e.left)
//    }

// sealed 클래스 집합유형 하나를 가질수 있지만 다른 유형을 가질수 없다
// when 에서 else가 필요 하지 않다

//interface User{
//    val nickname :String
////    val email:String
////        get() = email.substringBefore('@')
//}
//
//class PrivateUser(override val nickname : String) : User
//
//class SubscribingUser(val email :String) : User{
//    override val nickname : String
//    get() = email.substringBefore('@')
//}
////class FacebookUser(val accountId : Int) :User{
////    override val nickname = getFacebookName(accountId)
////                            //getFacebookName(이함수는 다른곳에 정의 되어있다고 가정한다.)
////}
//
//fun main(){
//    println(PrivateUser("test@kotlinlang.org").nickname)
//    println(SubscribingUser("test@kotlinlang.org").nickname)
//}