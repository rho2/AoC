import java.io.File

fun main(args: Array<String>) {
    println("HALLO WELT")
    
    val a = File("input.txt").readLines().map { p-> p.groupingBy { it }.eachCount().values }.count {2 in it}
    val b = File("input.txt").readLines().map { p-> p.groupingBy { it }.eachCount().values }.count {3 in it}
    
    println(a*b)
}