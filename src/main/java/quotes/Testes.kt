package quotes

/**
 * Created by diegoicosta on 05/08/16.
 */

val a: Int = 10
var b: Int = 10
var c = 10


class Customer(name: String) {
    val name: String

    init {
        this.name = name
    }
}

// DATA CLASSES
data class Address(val street: String, val city: String)

data class User1(val name: String, val address: Address)


class User

fun findByMpa(mpa: String): User {
    return User()
}

fun find(mpa: String): User {
    return User()
}


// OBJECTS SINGLETON
object Factory {
    fun build(name: String): User = User()
}


val user = Factory.build("Kotlin")


// OBJECTS STATIC METHOD
class User2 {
    companion object Factory {
        fun build(): User = User()
    }
}

val user2 = User2.build()

// OBJECTS ANONYMOUS INNER CLASSES

data class Event(val name: String)

interface Listener {
    fun onEvent(event: Event)
}

class Screen {
    fun addListener(listener: Listener) {
    }
}

val win = Screen()

val oo = win.addListener(object : Listener {
    override fun onEvent(event: Event) {
        throw UnsupportedOperationException()
    }
})

//  DEFAULT ARGUMENTS
fun save(cat: String, term: String = "kotlin") {
   // ...
}
val me = save(cat = "programming")


fun save2(cat: String="", term: String) {
    // ...
}
val me2 = save("programming")