fun main(){

println("Please select your customer / Service type:" + "\n" +
        "1) Commercial" + "\n" +
        "2) Residential"+ "\n")
    var type = readLine()!!.toInt()
    if (type == 1) {
        var customer1 = Commercial("null", false,"null", "null",
            "null", 0.00)
        println("Please enter the following information:")

        println("What is your Name?")
        var name = readLine()!!.toString()
        customer1.customerName = name

        println("What is your phone number?")
        var phone = readLine()!!.toString()
        customer1.customerPhone = phone

        println("What is your address?")
        var address = readLine()!!.toString()
        customer1.customerAddress = address

        println("What is the square footage of your property?")
        var square = readLine()!!.toDouble()
        customer1.squareFootage = square

        println("What is the property Name?")
        var name2 = readLine()!!.toString()
        customer1.propertyName = name2

        println("Do you have multiple properties, true or false?")
        var answer = readLine()!!.toBoolean()
        customer1.multiProperty = answer

        customer1.quote()
    }




    if (type == 2){
        var customer2 = Residential(false, "null", "null", "null",
        0.00)

        println("Please enter the following information:")

        println("What is your Name?")
        var name = readLine()!!.toString()
        customer2.customerName = name

        println("What is your phone number?")
        var phone = readLine()!!.toString()
        customer2.customerPhone = phone

        println("What is your address?")
        var address = readLine()!!.toString()
        customer2.customerAddress = address

        println("What is the square footage of your property?")
        var square = readLine()!!.toDouble()
        customer2.squareFootage = square

        println("Are you a senior citizen, true or false?")
        var answer = readLine()!!.toBoolean()
        customer2.senior = answer

        customer2.quote()


    }

}