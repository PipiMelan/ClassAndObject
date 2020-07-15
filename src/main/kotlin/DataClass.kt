

//Data Model
//MVp MVC MVVM -> model
//Data class
/*
* require:
* 1.At least one parameter in primary constructor of data class
* 2.modify the parameter with val\var
* 3.'open' 'inner' 'abstract' unallowed
* */
data class User1(
        var name:String,
        var password:String,
        var id:Int){

}

fun main() {
    val u = User1("jack","123",111)
    println(u)
}