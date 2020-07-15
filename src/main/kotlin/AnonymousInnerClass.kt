
/*
* interface can't be instantiated but we can instantiate the class of implementing the interface
* the methods in an interface is open by default  ↓
* */
 interface OntouchListener{
     fun onTouchEvent(type:String)
 }

class ButtonListener : OntouchListener{
    override fun onTouchEvent(type: String) {
        println("Event is $type")
    }

}

fun didTouch(listener: OntouchListener){
     listener.onTouchEvent("Pressed ")
 }



 fun main() {
//     var btn = ButtonListener()
//     didTouch(btn)
//     ButtonListener().also {
//        didTouch(it)
//     }
     ButtonListener().apply {
         didTouch(this)
     }
     //The anonymous inner class
     didTouch(object : OntouchListener{
         override fun onTouchEvent(type: String) {
             println("Event is $type")
         }
     })

 }
 class QQQ{
     fun show(){
         dispatchTouch(object : OnTouchListener1{
             override fun onTouchEvent(type1: String) {
                 println("$type1")
             }
         })
     }

     fun dispatchTouch(listener: OnTouchListener1){
         listener.onTouchEvent("Finger is sliding ")
     }

     interface OnTouchListener1{
         fun onTouchEvent(type1:String){  }
     }
 }