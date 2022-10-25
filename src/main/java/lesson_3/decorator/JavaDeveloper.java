package lesson_3.decorator;

// создадим класс разработчика реализующий интерфейс

public class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Пишем код на Java...\n";
    }
}
