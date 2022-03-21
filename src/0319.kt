fun fizzgame(i :Int) = when{
    i % 15 ==0 -> "FizzBuzz"
    i % 3 ==0 -> "Fizz"
    i % 5 ==0 -> "Buzz"
    else -> "$i"
}
fun main(){
    for(i in 1 downTo  100 step 2){
        println(fizzgame(i))
    }
}


