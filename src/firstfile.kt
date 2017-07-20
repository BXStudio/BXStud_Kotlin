
fun main(args: Array<String>){

    print("Enter your age : ")
    var age:Int= readLine()!!.toInt()

    print("Enter your name : ")
    val name:String?
    name = readLine()

    print("Enter your country : ")
    var country = readLine()

    println("--- Output ---")
    println("His name is " + name)
    println("And he is $age years old.")
    println("He come from $country.")

}