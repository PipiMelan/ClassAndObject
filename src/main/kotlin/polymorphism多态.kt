import java.util.*

open class Animal1(){
    open fun sleep(){
        println("Animals' Hibernation")
    }
 }
 class Dog():Animal1(){
        override fun sleep(){
            println("Hibernate in home")
        }
 }

 fun whereToSleep(animal:Animal1){
     animal.sleep()
 }

 interface OnClickListerner{
     fun onClick(){

     }
 }

 class Button : OnClickListerner{
     override fun onClick() {
         println("Button inherit interface")
     }
 }
 class Image : OnClickListerner{
     override fun onClick() {
         println("Button inherit interface")
     }
 }

    // Uniform the Interface
 fun test(listener: OnClickListerner){
     listener.onClick()
 }

 fun main() {
     val an = Animal1()
     val dog = Dog()

     whereToSleep(an)
     test(Button())
     test(Image())
 }