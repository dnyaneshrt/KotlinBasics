fun main()
{
    var names_list:MutableList<String>
    names_list= mutableListOf<String>("java","c","c++")
    names_list.add(2,"kotlin")

    for(i in 1..5)
    {
        names_list.add(readLine()!!)
    }
    for(name in names_list)
    {
        println(name)
    }
}