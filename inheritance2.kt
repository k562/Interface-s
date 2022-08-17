package inheritance

import java.util.concurrent.atomic.DoubleAdder

// open  class dad (legs : Int , color : String) {
//
//
//     fun walk(){
//         println("Walking")
//     }
//
//     fun eat(){
//         println("eating")
//     }
//
//    open fun sound(){
//        println("Make sound")
//    }
//
// }
//
//
// class kks (legs: Int, color: String): dad(legs, color){
//
//
//     fun code (){
//         println("coding")
//     }
//
//   override fun sound (){
//         println("making sound")
//     }
//
// }
//
//class gouri (legs: Int, color: String): dad(legs, color){
//
//    fun draw (){
//        println("Drawing")
//    }
//}
//
// fun main(){
//
//     val kks1 = kks(2,"skin color")
//     val gouri1 = gouri(2,"Skin color")
//
//
//     kks1.code()
//     kks1.eat()
//     kks1.walk()
//
//     gouri1.draw()
//     gouri1.walk()
//     gouri1.eat()
//
//
//
// }