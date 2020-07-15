

 // function without parameter and return value
 fun show(){

 }

//Unit == void
 fun buy(money:Int): Unit{

 }
 fun study(money:Int):Int{
      // ///
      return 8000
  }

 fun add(a:Int,b:Int) = a + b
 /*fun add(a:Int,b:Int):Int{
      return a + b
  }*/

 fun work(money:Int,name:String,type:String = "Android developing"){

 }

 // Get an array
 fun add(vararg names:Int){
     var result  = 0
     for (value in names){
        result += value
    }
     println(result)
 }

 // local functions 局部函数
 fun showView() {
     fun loadData() = "picture"
     fun showList() {
         // load data -> display
         loadData().also {
             println("Loaded contents:$it")
         }
     }
     showList()
 }
 /*fun showView(){
     fun loadData() = "picture"
     fun showList(){
         // load data -> display
         val img = loadData()
         println("Loaded contents:$img")
     }
     showList()
 }*/

 class TP(){
     fun goBack(){
         
     }
 }
 fun main() {
     work(8000,"John")
     work(money = 10000,name = "Merry")
     add(1,2,3,4)
     showView()
 }