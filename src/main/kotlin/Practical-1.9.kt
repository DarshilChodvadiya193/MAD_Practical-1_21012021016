fun main() {
    var array = ArrayList<Int>()
    print("Please enter Array values : ")
    for (i in 0 until 5) {
        print("array[$i] : ")
        var input = readLine()!!.toInt()
        array.add(input)
    }
    var max = Int.MIN_VALUE
    for (num in array) {
        if (num> max) {
            max = num
        }
    }
    println("Largest element : $max")
}
