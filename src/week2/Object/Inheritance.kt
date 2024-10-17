package week2.Object

import week2.Class.Manager
import week2.Class.member

fun main() {

    val manager = Manager(name = "Plugin")
    manager.sayHelo(name = "Mobile")

    val member = member(name = "syifa")
    member.sayHelo(name = "Plugin")
    
}