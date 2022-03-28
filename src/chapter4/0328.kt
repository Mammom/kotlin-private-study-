package chapter4

/* 데이터 클래스의 모든 프로퍼티를 읽기 전용으로 만들어서 데이터 클래스를
    불변클래스로 만들라고 권장한다. hashmap등의 컨테이너에 데이터 클래스
    객체를 담는 경우엔 불변성이 필수적이다. 데이터 클래스 객체를 키로 하는 값을 컨테이너에
    담은 다음에 키로 쓰인 데이터 객체의 프로펴티를 변경하면 컨테이너 상태가 잘못될수 있다.
    게다가 불변 객체를 사용하면 프로그램에 대해 훨씬 쉽게 추론할 수 있다.

    불변객체를 주로 사용하는 프로그램에서는 스레드가 사용중인 데이터를 다른 스레드가
    변경할 수 없으므로 스레드를 동기화해야 할 필요가 줄어든다.
*/
class Clientother(val name: String,val postalCode: Int){
    fun copy(name: String = this.name,
             postalCode: Int = this.postalCode) =
        Client(name,postalCode)
}

//class DelegatingCollection<T> : Collection<T>{
//    private val innerList = arrayListOf<T>()
//    override val size: Int get() = innerList.size
//    override fun isEmpty(): Boolean  = innerList.isEmpty()
//    override fun contains(element: T): Boolean = innerList.contains(element)
//    override fun iterator(): Iterator<T> = innerList.iterator()
//    override fun containsAll(elements: Collection<T>): Boolean =
//        innerList.containsAll(elements)
//}

class DelegatingCollection<T>(innerList:Collection<T> = ArrayList<T>()
) : Collection<T> by innerList{}

data class Person(val name :String){
    object NameComparator :Comparator<Person>{
        override fun compare(p1: Person, p2: Person): Int =
            p1.name.compareTo(p2.name)

    }
}

fun main(){
    val persons =listOf(Person("Bob"),Person("Alice"))
    println(persons.sortedWith(Person.NameComparator))
//    val lee = Clientother("이계영",4122)
//    println(lee.copy(postalCode=400))
}