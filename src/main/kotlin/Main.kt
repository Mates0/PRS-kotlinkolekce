import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sc = Scanner(System.`in`)
    val arr = ArrayList<Int>()
    while (true) {
        val input = sc.nextLine()
        if (input == "END")
            break
        arr.add(input.toInt())
    }
    println(arr)
    println(arr.distinct().size)
}