

 fun main() {
     Car("Benz",4,"Black")

     val xw = Student("Merry")
     println(xw.name)
     xw.name = "Others"
     println(xw.name)

     val zs = Student1("zs")
     println(zs.name)

     val ls = Student2()
     println(ls.name)
     //Parameter with 'name'
     val ls1 = Student2(wife = "rose")
}
 /* The primary constructor with parameters
  The parameters are local variable（局部变量）
  Both the inside and outside can't access them
  Only methods initialized by the object are accessible（只有对象初始化的方法可以访问）*/
 class Car1(brand:String){
     // Access the inner variable,make it can be accessed outside like java
     val myBrand = brand
     init{
         println(brand)
     }
     constructor(brand:String,color:String):this(brand){

     }
 }
 class Car(brand:String,wheel:Int,color:String){

 }
    /*Parameter attributes and provides a default value*/
 class Student(var name:String){
        // 'var' makes it can change the value
    }
/*
 this equals to :
 class Student(name:String){
      var aName = name
 }
*/
class Student1(var name:String,var wife:String = ""){

}
 class Student2(var name:String = "ls",var wife:String = ""){

}