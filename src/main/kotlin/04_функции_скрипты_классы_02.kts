import java.io.File

fun log(data: String) {
    println(data)
    File("log.txt").appendText(data + "\n")
}

log("some data")

log("another data")