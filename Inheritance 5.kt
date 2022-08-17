package inheritance

 fun main () {

     val d1 = Dog()
     println(d1.name)
     println(d1.age)

     val c1 = Cat()
     println(c1.name)
     println(c1.age)
     println(c1.legs)
     c1.walk()
     c1.play()


 }



  open class Animals  {

      open var name  : String = "Mike"

      open var age  : Int = 4

      open fun walk (){

          println("$name is walking")
      }

  }


 class Dog : Animals () {

     fun eat () : Unit {
         println("$name is eating")
     }


 }

class Cat : Animals () {

    override var name : String = "olive"
    override var age : Int = 10
    var legs : Int = 4

    override fun walk (){
        println("$name is walking in the road")
    }

    fun play(){
        println("$name is playing")
    }

}