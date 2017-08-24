class computer(var Type:String,var Mark:String,
               var YOM:Int,var Price:Double) { // YOM = Year of Marketing

    init {
      /* On cherche les valeurs...
      ...associées à nos paramètres*/

        this.Type=Type
        this.Mark=Mark
        this.YOM=YOM
        this.Price=Price
    }

// ** Méthodes **

  /* On défini nos méthodes auxquelles...
  ... on associe nos valeurs */

    fun GetType():String?{
        return this.Type
    }
    fun GetMark():String?{
        return this.Mark
    }
    fun GetYOM():Int?{
        return this.YOM
    }
    fun GetPrice():Double?{
        return this.Price
    }
}

fun main(args:Array<String>){

// ** Variables (Ordinateurs) **

    var Computer1= computer("Office","HP",
            2017,499.99)

  /* On imprime les valeurs respectives de chaque var...
  ...en faisant appel à nos méthodes */
    println("Type : " + Computer1.GetType())
    println("Mark : " + Computer1.GetMark())
    println("YOM : " + Computer1.GetYOM())
    println("Price : " + Computer1.GetPrice())

    println("-----------")

    var Computer2= computer("Gaming","Alienware",
            2015,899.99)
    println("Type : " + Computer2.GetType())
    println("Mark : " + Computer2.GetMark())
    println("YOM : " + Computer2.GetYOM())
    println("Price : " + Computer2.GetPrice())
}