package id.ac.polbeng.gita.test_kelas

fun main() {
    //cretaing an instance of the interface
    var programmer: Human = object : Human {
        override fun think() {
            print("I am an example of Anonymous Inner Class")
        }
    }
    programmer.think()
}

interface Human {
    fun think()
}