
fun main() {
    print("Masukkan Angka: ")
    val tampung = readLine()?.toInt()?: 0

    if (bilanganPrima(tampung)){
        println("$tampung adalah bilangan prima")
    } else {
        println("$tampung bukan bilangan prima")
    }
}

fun bilanganPrima(number: Int): Boolean{
    if (number <= 2){
        return false
    }
    for (i in 2..number / 2){
        if (number % i == 0){
            return false
        }
    }
    return true
}