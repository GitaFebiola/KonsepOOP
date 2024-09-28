package id.ac.polbeng.gita.test_kelas

class Outer {
    val a = "Outside Nested class."
    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}

fun main() {
    //accesssing member of nested class
    println(Outer.Nested().b)

    //creating object of nested class
    val nested = Outer.Nested()
    println(nested.callMe())
}