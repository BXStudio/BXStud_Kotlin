var DOB=1979 // public

fun fct1():Unit{
    // On ne peut pas récupérer var name ici
    // mais on peut récupérer var DOB ici
    println("DOB : $DOB")
}

fun main(args:Array<String>){
    fct1()
    var name="Jeremy" // var locale (fun main)
    println("Name : $name")
    println("DOB : $DOB")
}