package lesson_3.decorator;

// создаем класс тим-лида который так же расширяет наш декоратор

public class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Отсылаю недельный отчет...\n";
    }

    // переопределили метод и добавили новый функционал
    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
