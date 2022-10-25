package lesson_3.decorator;

// создадим декоратор, который при создании будет принимать экземпляр разработчика

public class DeveloperDecorator implements Developer {

    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
