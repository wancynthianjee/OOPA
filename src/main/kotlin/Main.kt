fun main (){
    val cynthia=Human("usa",20,64)
    cynthia.eat(6)
    println("hello,how are you")
    cynthia.currentAge(20)

    val information=user("Cynthia","Wanjiru",
        "wanjirucynthiaanjerii@gmail.com","0742111320","#babyjohn!@2021+mommy")
    println(information.lastName)
    println(information.email)
}

//
//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
// eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten

class Human(var name:String, var age:Int, var weight:Int){
    fun eat (foodweigt:Int){
        weight *=foodweigt
        println("I am eating $foodweigt kgs of food")
    }


//     speak(speech: String) :Prints the string passed to it

    fun speak(speech:String){
        println(speech)
    }

//    birthday( ) :Increments the human’s age by 1

    fun currentAge(age:Int){
        var birthday= age +1
        println(birthday)

    }

}

//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes

data class user(val firstName:String, val lastName:String, val email:String,
                val phoneNumber:String,
                val password:String)