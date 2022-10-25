package lesson_3.facade;

public class Developer {
// класс разработчика принимая состояние трекера работает либо нет
    public void doJobBeforeDeadline(BugTracker bugTracker) {

        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problems.");
        } else {
            System.out.println("Developer is sleeping");
        }
    }
}
