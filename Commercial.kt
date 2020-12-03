class Commercial(var propertyName: String,
                 var multiProperty: Boolean,
                 customerName: String,
                 customerPhone: String,
                 customerAddress: String,
                 squareFootage: Double):
                 Customer(customerName, customerPhone, customerAddress, squareFootage){

    init {
        propertyName = propertyName
        multiProperty = multiProperty
    }

fun quote(){
    var quote = (squareFootage / 1000) * 5
    if (multiProperty == true){
        quote -= (quote * .1)
    }
    println("Customer Name: $customerName " + "Property: $propertyName " + "Multiple Properties: $multiProperty")
    println("Phone Number: $customerPhone " + "Address: $customerAddress")
    println("Property size: $squareFootage square feet")
    println("Estimated price: $quote")

}
}