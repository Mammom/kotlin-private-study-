package chapter5


data class Person(val name: String, val age: Int)


fun findTheOldest(people : List<Person>){
    var maxAge = 0 //가장 많은 나이를 저장한다.
    var theOldest:Person? = null //가장 연장자인 사람을 저장한다.
    for(person in people){
        if(person.age > maxAge){ //  현재까지 발견한 최연장자 보다 더 나이가 많은 사람을 찾으면 최댓값을 바꾼다.
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}



fun main(){
    val people = listOf(Person("이몽룡", 29), Person("성춘향",31))
    findTheOldest(people)

    val name = people.joinToString(separator = " ",
                                    transform = { p: Person ->p.name})
    println(name)

    println(people.maxByOrNull { it.age }) //람다식
    println(people.joinToString(" ") { p: Person ->p.name }) //람다식


    val sum = {x:Int,y:Int ->x+y}
    println(sum(5,1))
}