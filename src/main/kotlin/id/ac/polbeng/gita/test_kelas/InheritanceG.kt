package id.ac.polbeng.gita.test_kelas

open class Base(val name: String) {
    init {
        println("Initializing Base")
    }
    open val size: Int = name.length.also {
        println("Initializing size in Base: $it")
    }
}

class Devired(name: String, val lastName: String) :
        Base(name.capitalize().also { println("Argument for Base: $it") }) {
            init {
                println("Initializing Devired")
            }
    override val size: Int = (super.size + lastName.length).also {
        println("Initializing size in Devired: $it")
    }
        }

fun main() {
    val turunan = Devired("Gita", "Enda")
    turunan.size
}