import java.util.*
import kotlin.collections.HashSet

fun main() {
    val sc = Scanner(System.`in`)
    println("Zadej číslo n")
    val input = sc.nextLine()
    val vegetableset = HashSet<String>()
    println("Zadej názvy zeleniny")
    for (i in 0 until input.toInt()) {
        val vegetables = sc.nextLine()
        if (vegetableset.contains(vegetables))
            println("Tato položka je duplicitní a proto nebyla uložena")
        vegetableset.add(vegetables)
    }
    println("Zadej číslo m")
    val input2 = sc.nextLine()
    val fruitset = HashSet<String>()
    println("Zadej názvy ovoce")
    for (i in 0 until input2.toInt()) {
        val fruit = sc.nextLine()
        if (fruitset.contains(fruit))
            println("Tato položka je duplicitní a proto nebyla uložena")
        fruitset.add(fruit)
    }
    println("Zadej výraz k vyhledání")
    while (true) {
        val input3 = sc.nextLine()
        if (input3 == "END")
            break
        if (vegetableset.contains(input3))
            println("Tato položka je zelenina")
        if (fruitset.contains(input3))
            println("Tato položka je ovoce")
        if (!fruitset.contains(input3) && !vegetableset.contains(input3))
            println("Tato položka není ani ovoce ani zelenina")
    }
    println("Zelenina:")
    println(vegetableset)
    println("Ovoce:")
    println(fruitset)
}