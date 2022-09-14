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

}

val history = History()

println( history.isExists("some") )

println( history.isExists("not") )