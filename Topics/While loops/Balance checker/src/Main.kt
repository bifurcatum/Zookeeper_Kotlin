import java.util.Scanner

fun main() {
    var balance = readln().toInt()
    val scanner = Scanner(System.`in`)
    var purchase = 0
    var err = false
    while (scanner.hasNextInt()) {
        purchase = scanner.nextInt()

        if (balance - purchase < 0) {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $purchase.")
            err = true
            break
        }
        balance -= purchase
    }
    if (!err) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}