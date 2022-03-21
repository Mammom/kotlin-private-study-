package `Chapter1~2`//fun `Chapter1~2`.main(args : Array<String>) {
//    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
//    println("하이, $name" )
//}

//fun `Chapter1~2`.main(args:Array<String>){
//    if(args.size >0){
//        println("반가워요, ${args[0]}")
//    }
//}

//fun `Chapter1~2`.main(args: Array<String>){
//    println("하이 ${if(args.size>0) args[0] else "someone"}")
//}

//fun `Chapter1~2`.main(){
//    val person = Person("Bob",true)
//    println(person.name)
//    println(person.isMarried)
//}
//class Person(val name:String,var isMarried :Boolean)

//package geometry.shapes
//import java.util.*
//
//class Rectangle(val height :Int, val width:Int){
//    val isSquare : Boolean
//    get() = height ==width
//}
//fun createRandomRectangle() : Rectangle{
//    val random = Random()
//    return Rectangle(random.nextInt(),random.nextInt())
//}