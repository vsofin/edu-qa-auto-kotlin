import java.io.File

fun isExists(substring: String): Boolean {
    val lines = File("log.txt").readLines()

    lines.forEach() {
        if (substring in it)
            return true
    }

    return false
}

println( isExists("some") )

println( isExists("not") )