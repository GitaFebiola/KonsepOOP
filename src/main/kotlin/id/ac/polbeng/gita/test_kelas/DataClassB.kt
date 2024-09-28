package id.ac.polbeng.gita.test_kelas

fun main() {
    val boni = Student("Boni", 21)
    val newBoni = Student("Boni", 21)
    val meri = Student("Meri", 20)
    if (boni.equals(newBoni))
        println("boni is equal to newBoni.")
    else
        println("boni is not equal to newBoni.")

    if (boni.equals(meri))
        println("boni is equal to meri.")
    else
        println("boni is not equal to meri.")

    println("Hashcode of boni: ${boni.hashCode()}")
    println("HashCode of newBoni: ${newBoni.hashCode()}")
    println("HahsCode of meri: ${meri.hashCode()}")
}