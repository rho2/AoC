import java.io.File

fun main(args: Array<String>) {
    println("HALLO WELT")

    val lines = File("input.txt").readLines()
    val a = lines.map { p-> p.groupingBy { it }.eachCount().values }.count {2 in it}
    val b = lines.map { p-> p.groupingBy { it }.eachCount().values }.count {3 in it}

    println(a*b)

    var m = mutableListOf<Char>()

    for (l1 in lines) {
        for(l2 in lines){
            if(l1 == l2)
                continue
            val d = mutableListOf<Char>()
            for ((i,c) in l1.withIndex()) {
                if(c == l2[i]){
                    d.add(c)
                }
            }
            if(d.size >= m.size){
                m = d;
            }
        }
    }

    println(m.joinToString(""))
}