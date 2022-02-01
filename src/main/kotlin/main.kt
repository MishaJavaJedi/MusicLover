fun main() {
    val itemPrice = 100
    val itemCount = 102
    val discount = 100
    val discountStart = 1_000
    val isRegular = true
    val totalPrice = itemPrice * itemCount

    if(totalPrice < discountStart) {
        println("Total Price: $totalPrice (no discount)")
    }
    if(totalPrice in 1001..10_000){
        println("Total Price: ${totalPrice - discount} (100rub discount)" )
    }
    if (totalPrice > 10_001 && isRegular) {
        val tempResult = totalPrice - (totalPrice / 100 * 5)
        val result = (tempResult - (tempResult / 100))
        println("Total Price: $result (5% discount + 1% for regular purchases)")
    }
    if (totalPrice > 10_001 && !isRegular) {
        val result = totalPrice - totalPrice / 100 * 5
        println("Total Price: $result (5% discount) ")
    }
}
