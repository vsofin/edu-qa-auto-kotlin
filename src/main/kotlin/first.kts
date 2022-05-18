import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

val odds = listOf("01", "03", "05", "07", "09", "11")

val time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH"))

if (time in odds)
    println("Сейчас значение часа нечетное: " + time)
else
    println("Сейчас значение часа четное: " + time)
