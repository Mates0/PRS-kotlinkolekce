import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val arr = ArrayList<Int>()
    var sum = 0
    while (sc.hasNext()) {
        arr.add(sc.nextInt())
    }
    for (integer in arr) {
        sum += integer
    }
    val avg = sum / arr.size
    for (i in arr.indices) {
        if (arr[i] >= avg) {
            println(arr[i])
        }
    }
}