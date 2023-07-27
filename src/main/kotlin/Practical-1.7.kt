fun main() {
    print("Enter Number : ")
    var num = readLine()!!.toInt()
    var result : Int
    result = fact(num)
    println("Factorial of $num = $result")
    println("By TailRec Keyword, Factorial of $num = $result")
}
tailrec fun fact(n: Int): Int {
    return if (n == 1){
        n
    }
    else {
        n * fact(n-1)
    }
}
