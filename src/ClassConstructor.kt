class ConstClass() { //class2 est considéré comme constructor

  /* On crée ici un autre constructor...
  ...pour faire comprendre à notre programme...
  ...que l'on doit l'utiliser on utilise : this() */

    var Type:String?=null
    var Mark:String?=null
    var YOM:Int?=null
    var Price:Double?=null

    constructor(Type:String,Mark:String,
    YOM:Int,Price:Double):this(){
        println("Le programme utilise le premier constractor.")
        this.Type=Type
        this.Mark=Mark
        this.YOM=YOM
        this.Price=Price
    }

    var Owner:String?=null
    constructor(Owner:String):this(){
        println("Le programme utilise le second constractor.")
        println("Owner : $Owner")
    }

    fun GetOwner():String?{
        return this.Owner
    }
}

fun main(args:Array<String>){
    var computer = ConstClass("Acer")
    println("Utilisons le second...")
    var computer2 = ConstClass("Office", "Acer", 2017, 599.0)
}