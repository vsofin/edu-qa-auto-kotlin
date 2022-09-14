import java.io.File

class History {

    fun log(data: String) {
        println(data)
        File("log.txt").appendText(data + "\n")
    }

    fun isExists(substring: String): Boolean {
        val lines = File("log.txt").readLines()

        lines.forEach() {
            if (substring in it)
                return true
        }

        return false
    }

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

}

val history = History()

println( history.whereExists("data") )

val regex = Regex("(s*e)")
println( history.whereExists(regex) )