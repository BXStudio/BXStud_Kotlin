fun main(args:Array <String>){
    var arrayInt= Array<Int>(5){2}
    // On définit les valeurs des cases 0 et 1...
    arrayInt[0]=1
    arrayInt[1]=3
    println("Le contenu du tableau est : ")
    var case=-1
    for (content in arrayInt){
        case++
        println("arrayInt[$case]= $content")
    }

    println("--- Entrez les noms ---")
    var arrayStr=Array<String>(4){""}
    for(index in 1..3){
        print("arrayStr[$index]= ")
        arrayStr[index]= readLine()!!
    }

    println("--- Vous avez entré --- ")
    for(index in 1..3){
        println("arrayStr[$index]= " +arrayStr[index])
    }
}