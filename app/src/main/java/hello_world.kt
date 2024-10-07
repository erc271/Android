fun main () {
    val ayoubb = "Hello world"
    println(ayoubb)
    test()

}
fun test () {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}
fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!" // Use the name parameter
    val ageGreeting = "You are now $age years old!" // Use the age parameter
    return "$nameGreeting\n$ageGreeting" // Return the formatted greeting
}

fun main() {
    // Call the function with the correct number of parameters
    println(birthdayGreeting("Ahmad", 5))
    println(birthdayGreeting("Krim", 3))
}

//fun new(): String{
//  val  ayoub = "bakali"
//    return ayoub
//
//}
//fun birthdayGreeting(name: String = "Rover", age: Int): String {
//    return "Happy Birthday, $name! You are now $age years old!"
//}

//fun main () {
//    var count = 2
//    count ++
//    println("you have $count unread message!!")
//
//}
/* fun main () {
  gift()
}
fun gift (){
    println("You have 2 unread message")
    println("You have 3 unread messsage")
}

*/
