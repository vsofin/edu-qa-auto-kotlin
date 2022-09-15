import java.io.File

fun whereExists(substring: String): List<String> {
    val result = mutableListOf<String>()

    val lines = File("log.txt").readLines()

    lines.forEach() {
        if (substring in it)
            result.add(it)
    }

    return result
}

fun whereExists(regex: Regex): List<String> {
    val result = mutableListOf<String>()

    val lines = File("log.txt").readLines()

    lines.forEach() {
        if ( it.contains(regex) )
            result.add(it)
    }

    return result
}


println( whereExists("data") )

val regex = Regex("(s*e)")
println( whereExists(regex) )