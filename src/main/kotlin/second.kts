import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.random.Random

val odds = listOf("01", "03", "05", "07", "09", "11", "13", "15", "17", "19", "21", "23", "25", "27", "29", "31",
    "33", "35", "37", "39", "41", "43", "45", "47", "49", "51", "53", "55", "57", "59",)

for ( i in listOf(1,2,3,4,5) ) {
    val minute = LocalDateTime.now().format(DateTimeFormatter.ofPattern("mm"))

    if (minute in odds)
        println("Сейчас значение минуты нечетное: " + minute)
    else
        println("Сейчас значение минуты четное: " + minute)

    val waitTime = Random.nextLong(1000, 10000)

    Thread.sleep(waitTime)
}