import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

val odds = listOf("01", "03", "05", "07", "09", "11")

val hour = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH"))

if (hour in odds)
    println("Сейчас значение часа нечетное: " + hour)
else
    println("Сейчас значение часа четное: " + hour)
