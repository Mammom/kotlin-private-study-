package chapter4

class User(val name :String){
    var address : String = "unspecified"
    set(value : String){
        println("""Address was changed for $name : 
            "$field" -> "$value".""".trimMargin())
        field = value
    }
}

class LenghthCounter{
    var counter :Int =0
    private set
    fun addWord(word :String){
        counter+=word.length
    }
}

class Client(val name :String, val postalCode :Int){
    override fun equals(other:Any?):Boolean{
        if(other == null || other !is Client)
            return false
        return name == other.name &&
                postalCode == other.postalCode
    }
    override  fun toString() = "Client(name = $name, postalCode = $postalCode)"
}

fun main(){
//    val user = User("Alice")
//    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"
//    val lenghtCounter = LenghthCounter()
//    lenghtCounter.addWord("HI!")
//    println(lenghtCounter.counter)
    val client1 =Client("오징어", 4112)
    val client2=Client("오징어", 4112)
    println(client1==client2) //equals

}

