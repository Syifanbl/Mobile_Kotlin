package week2.Class

open class Emplove (val name: String){
    fun sayHelo(name: String){
        println("hello $name myname is ${this.name}")
    }
}

class Manager (name: String) : Emplove(name)

class member (name: String) : Emplove(name)

