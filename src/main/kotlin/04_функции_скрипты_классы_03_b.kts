import java.io.File

class History {

    fun log(data: String) {
        println(data)
        File("log.txt").appendText(data + "\n")
    }

}
