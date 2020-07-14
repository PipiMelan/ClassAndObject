

 fun main() {
     //We instantiate an object and call a constructor directly
    val p = Person()
}
/*
* Kotlin has two kinds of constructors
* 1. Primary constructor -The Head of class(类的头部)
* 2. Sub constructors - The inner of class(类的内部)
* */
 //A constructor is provided without parameter by default
 class Person{

 }


 class Person1(){

 }

 // Showing this is a constructor by teh keyword - 'constructor'
 // When there exits the Modifier,'constructor' can't be omitted
 class Person2 private constructor(){

 }
// class Person2 constructor(){
//      init{
//            println("inti Method exits by default")
//    }
// }

 // Provide sub constructors
 // Attention: the sub constructor must show that it has invoked the primary constructor
 class Person3(){
     constructor(name:String):this(){

     }

     constructor(name:String,age:Int):this(){

     }
 }