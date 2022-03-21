import java.util.*

fun main(){
    val binaryRepes = TreeMap<Char, String>()
    for(c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryRepes[c] = binary
    }
    for((letter,binary)in binaryRepes){
        println("$letter = $binary")
    }

}

