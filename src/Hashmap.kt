fun main(args:Array<String>){
    var map=HashMap<Int,String>()
    map.put(1,"Romain")
    map.put(2, "Warren")
    map.put(3, "Alberto")
    map.put(4, "Thomas")
    println(map.get(2))

    // Il est possible de mettre la valeur à jour.
    map.put(4, "Voeckler")
    for(clef in map.keys){
        println(map.get(clef))
    }
}