fun main(args: Array <String>){

    // (++x)=(x=x+1) et (--x)=(x-1)
    var x=10
    var y=11
    var z= ++x+y
    println("z : $z")

    println("Avant x: $x")
    var w=x---y
    println("w: $w")
    println("Après x: $x")


}

