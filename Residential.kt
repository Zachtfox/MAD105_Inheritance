class Residential(var senior: Boolean,
                  customerName: String,
                  customerPhone: String,
                  customerAddress: String,
                  squareFootage: Double):
                  Customer(customerName, customerPhone, customerAddress, squareFootage) {

fun quote(){
    var quote = (squareFootage / 1000) * 6
    if (senior == true){
        quote -= (quote * .15)
    }
    println("Customer Name: $customerName " + "Senior Citizen: $senior")
    println("Phone Number: $customerPhone " + "Address: $customerAddress")
    println("Property size: $squareFootage square feet")
    println("Estimated price: $quote")
}
}