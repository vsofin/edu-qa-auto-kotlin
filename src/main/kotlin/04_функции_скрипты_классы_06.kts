import java.io.File

fun whereExists(regex: Regex, file: String = "log.txt"): List<String> {
    val result = mutableListOf<String>()

    val lines = File(file).readLines()

    lines.forEach() {
        if ( it.contains(regex) )
            result.add(it)
    }

    return result
}


val regex = Regex("(s*e)")
println( whereExists(regex) )
println( whereExists(regex, "file.txt") )