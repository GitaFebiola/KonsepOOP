package id.ac.polbeng.gita.test_kelas

//private
private class privateExample {
    private val i = 1
    private fun doSomething() {
        println("Welcome to Private access!")
        println("Private Access : $i")
    }
    fun calldoSomething(){
        doSomething()
    }
}

//protected
open class C() {
    protected val i = 1
}
class D : C() {
    fun getValue() : Int {
        println("Welcome to protected access!")
        return i
    }
}

//internal
class internalExample {
    internal val i = 1
    internal fun doSomething() {
        println("Welcome to Internal access!")
        println("Internal access : $i")
    }
}

//public
class publicExample {
    val i = 1
    fun doSomething() {
        println("welcome to public access!")
        println("Public Access : $i")
    }
}

fun main() {
    val objPrivate = privateExample()
    objPrivate.calldoSomething()
    val objProtected = D()
    println(println("Protected Access : ${objProtected.getValue()}"))
    val objInternal = internalExample()
    objInternal.doSomething()
    val objPublic = publicExample()
    objPublic.doSomething()
}