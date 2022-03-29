package chapter4

class A{
    companion object {
        fun bar(){
            println("Companion object called")
        }
    }
}

//class User1{
//    val nickname:String
//    constructor(email :String){
//        nickname = email.substringBefore('@')
//    }
////    constructor(facebookAccountId : Int){
////        nickname = get
////    }
//}

class User2 private constructor(val nickname :String){
    companion object{
        fun newSubscribingUser(email: String) =
            User2(email.substringBefore('@'))
//        fun newFacebookUser(accountId :Int)=
//            User2(getFacebookName(accountId))
    }
}


fun main(){
//    A.bar()
    val subscribingUser = User2.newSubscribingUser("bob@gmail.com")
    println(subscribingUser.nickname)
}