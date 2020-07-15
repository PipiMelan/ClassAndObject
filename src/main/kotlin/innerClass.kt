/*
* nested class is dependent ,they can't access the attributes and methods in host class
* */
 class Bank{
//     var money : Money? = null
//     lateinit var money: Money
//     val money : Money by lazy {Money(0)}
        var money = Money(0)
     //money
     //nested class嵌套类
     class Money(var num:Int){}

     //bank card
     // inner class 内部类
     inner class Card(){
        fun save(count:Int){
             money.num += count
         }

         fun withDraw(count:Int){
             if(money.num >= count){
                 money.num -= count
                 println("Withdraws success!,the balance is ${money.num}")
             }else{
                 println("Not sufficient fund")
             }
         }

     }
 }

fun main() {
//    Bank.Money(0)
    val card = Bank().Card()
    card.save(200)
    card.withDraw(100)
}