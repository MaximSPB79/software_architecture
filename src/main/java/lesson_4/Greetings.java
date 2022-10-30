package lesson_4;

import java.time.LocalTime;

public class Greetings {

    private static final LocalTime time = LocalTime.now();
    private static final LocalTime morning1 = LocalTime.of(05, 00);
    private static final LocalTime morning2 = LocalTime.of(12, 00);
    private static final LocalTime afternoon = LocalTime.of(18, 00);
    private static final LocalTime evening = LocalTime.of(23, 59);

    // выводим приветствие в зависимости от времени суток
    public static void greetings() {
        if (time.isAfter(morning1) && time.isBefore(morning2)) {
            System.out.println("Доброе утро!\n");
        } else if (time.isAfter(morning2) && time.isBefore(afternoon)) {
            System.out.println("Добрый день!\n");
        } else if (time.isAfter(afternoon) && time.isBefore(evening)) {
            System.out.println("Добрый вечер!\n");
        } else {
            System.out.println("Добро ночи!\n");
        }
    }
}