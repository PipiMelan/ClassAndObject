

// ’set' & 'get'
/*
* The 'set' & 'get' methods wile be created by default when attributes are defined
* val constant attributes ：'get' method only
* var variable attributes : 'set' & 'get' methods
* */

/*
* the attributes of class in kotlin must be initialised when defined - Initialization
* And we can override the set/get method
* */


// class Shape(var name:String){ }

 class Shape(){
    var name:String = "" // Assign the initial value when defined


        /*
        * Every attribute has an inner variable named 'filed' by default
        * And this variable can be invoked only in initialising
        * */
    set(value){field = value.toUpperCase() }
    get() = field.toLowerCase()

     // privatization
     var password:String = "1234"
     private set
}

 class Boy{
    /*
     *  '?' -> Nullable types
     *  1. Use it when define a uncertain variable
     *  2. Receive the return value in java
     */
    var girlFriend:String? = null
     fun show(){
//      println(girlFriend.length)    // error
         /*
         * we must use '?' for a nullable type object
         * */
        println(girlFriend?.length)  //var girlFriend:String? = null -> Because of ‘?' in it


         /*
         * We use '!!' to show that this can't be a null type
         * */
        println(girlFriend!!.length)
     }
}

// 1.Project loading -> Data loading -> Display interface(界面)
// 2.Project loading -> Display interface
// 3.       ->Display interface
 class Activity{
//    var data: String
    //懒加载
    // value exists when invoked
    val data :String by lazy {
    "pictures"
    }

    //延迟加载
    //This variable must init in a certain monment
    lateinit var imqData:String
    fun showActivity(){
        imqData = "this 'lateinit' variable is initialised now"
        println("loaded data:$data")
    }
}


 fun main() {
  /*   val tt = MyClass.look()
//   println(tt.length)  // NullPointerException
     println(tt?.length) // 'null'

     val shape = Shape()
     shape.name = "quadrangle" // Invoke the 'set' method
     println(shape.name)    //invoke the 'get' method
//   shape.password = "1111"  //ERROR*/

    Activity().showActivity()
 }