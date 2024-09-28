package id.ac.polbeng.gita.test_kelas

abstract class Vehicle(val name: String,
                    val color: String,
                    val weight: Double) { // concrete (non abstract) properties

    //abstract property (must be overriden by subclasses)
    abstract var maxSpeed: Double

    //abstract methods (must be implemented by subclasses)
    abstract fun start()
    abstract fun stop()
    abstract fun sound()

    // concrete (Non-Abstract) method
    fun displayDetails(){
        println("Name: $name, Color: $color, Weight: $weight, Max Speed: $maxSpeed")
    }
}

class Car(name: String,
          color: String,
          weight: Double,
          override var maxSpeed: Double): Vehicle(name, color, weight) {

    override fun start() {
        println("Car Started")
    }

    override fun stop() {
        println("Car Stopped")
    }

    override fun sound() {
        println("Brum...brum...brum!")
    }
}

class Motorcycle(name: String,
                color: String,
                weight: Double,
                override var maxSpeed: Double): Vehicle(name, color, weight) {

    override fun start() {
        println("Bike Started")
    }

    override fun stop() {
        println("Bike Stopped")
    }

    override fun sound() {
        println("Preng...preng...preng!")
    }
}

fun main() {
    val car = Car("Ferrari 812 Superfast", "red", 1525.0, 339.60)
    val motorcycle = Motorcycle("Ducati 1098s", "red", 173.0, 271.0)

    car.displayDetails()
    motorcycle.displayDetails()

    car.start()
    car.sound()
    car.stop()
    motorcycle.start()
    motorcycle.sound()
    motorcycle.stop()
}