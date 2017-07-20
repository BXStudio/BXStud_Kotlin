/*
Operations rules | Priorites rules
1. () 2. ^ 3. *, / 4. +, - 5. =
*/
fun main (args:Array <String>){

    println("--- First Operation ---")

    var n1:Int=10
    var n2:Int=10
    var n3:Int=5
    var som:Int?
    som=n1+n2*n3-3;
    println("som : $som") // same thing with : print("som:" + som)

    println("--- Second Operation ---")
    var som2 = (n1+n2)*n3-3
    println("som2 : $som2")
}