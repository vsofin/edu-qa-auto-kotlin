val names = mutableListOf<String>("anybody")

fun greeting(names: List<String>) {
    for (i in names) {
        println("Hello, $i")
    }
}

greeting(names)
