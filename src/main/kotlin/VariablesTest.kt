//mutable(var) and immutable(val) variables.
//based on type of data it identifies data type... type inference.
//kotlin does not have primitive type of variables.

fun main(args:Array<String>)
{
    //1  to 31
    var day:Int=10;
    day=11;

// print("day is "+day)
    println("day is ${day+5}")
//    var name="dnyaneshwar"
    println("please enter your name:")
    var name= readLine()!!
    println("my name is ${name.toUpperCase()}")

    print("enter any number")
    var num= readLine()!!.toInt()
    print("sqaure of entered number is ${num*num}")

}