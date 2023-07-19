fun main()
{

   /* for(i in 1..100)
    {
       println("num is : $i")
    }*/
 /*   for(i in 1..100 step 5)
    {
        println("num is : $i")
    }*/
  /*  for(i in 100 downTo 1)
    {
        println("num is : $i")
    }*/
 /*   for(i in 1 until 100)
    {
        println("num is : $i")
    }*/

    for(i in 1..5)
    {
        for(i in 1..i) {
            print("* ")
        }
        println()
    }
}