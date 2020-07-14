/*
* Inheritance:
* Add new methods and attributes to existing class
* 1.inherit
* 2.function extension
* */

// The class can't be inherited by default in Kotlin -> make it 'open'
open class Father(var name:String,var age:Int = 30){
    open fun work(){
        println("work + $name + $age")

    }
}
open class Animal(){
}
/*
    Single inheritance only
class Child() : Father(),Animal(){ } -> Does't work
 But we can do this: open class Father() : Animal(){ }
 */
class Child(name:String) : Father(name,40){  // -> here Child(name:String) means passing its name to Father,and 'age' are alterable
//class Child() : Father("LG",40){
    fun show(){
    println("$name + $age")
    }
    override fun work(){
        //Invoke the original 'work' method with 'super' when need
        super.work()

        //Make the original 'work' method open
        println("Country")
    }
}
/*
* Parameter should always follow
* */
fun main() {
    val xw = Child("xw").work()
    //val xw = Child()
    //xw.work()
}