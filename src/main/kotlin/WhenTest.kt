fun main()
{
    var age= readLine()!!.toInt()
    var eleigible=if(age>18)
    {
        println("eleigible for vote")
        age
    }else
    {
        "not eligible go home and play"
    }
    println(eleigible)


    print("please enter day number:")
    var num= readLine()!!.toInt()
  /*  when(num)
    {
        1->println("today is sunday")
        2->println("today is Monday")
        3->println("today is Tuesday")
        4->println("today is wednesday")
        5->println("today is thursday")
        6->println("today is friday")
        7->{println("today is saturady")
        println("it's weekend. Go and enjoy")}
        else->
            print("invalid choice")
    }*/

   var result= when(num)
    {
        1->"today is sunday"
        2->"today is Monday"
        3->"today is Tuesday"
        4->"today is wednesday"
        5->"today is thursday"
        6->"today is friday"
        7->{"today is saturady"
           "it's weekend. Go and enjoy"}
        else->
            "invalid choice"
    }
    print(result)


}