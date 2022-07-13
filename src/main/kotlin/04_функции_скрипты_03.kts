val names = mutableListOf<String>()

fun greeting(say: String, names: List<String>) {

    for (item in names) {
        println("$say, $item")
    }

}
greeting("Hello", names)

val namesHi = mutableListOf<String>()
greeting("Hi", namesHi)