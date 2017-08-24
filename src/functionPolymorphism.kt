fun show(name:String):Unit{
    println("Name : $name")
}

fun show(DOB:Int):Unit{
    println("DOB : $DOB")
}

fun show(Other:Double):Unit{
    println("Other : $Other")
}

fun main(args:Array<String>){
    show("Nom")
    show(1979)
    show(10.2)
}
