package lesson_3.decorator;

// создаем класс опытного сеньор разработчика, который расширяет класс нашего декоратора

public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Занимаемся проверкой кода...\n";
    }
// переопределили метод и добавили новый функционал

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
