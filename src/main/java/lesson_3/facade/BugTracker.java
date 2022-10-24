package lesson_3.facade;

public class BugTracker {

    private boolean activeSprint;
// метод возвращающий состояние спринта
    public boolean isActiveSprint() {
        return activeSprint;
    }
// старт спринта
    public void startSprint(){
        System.out.println("Sprint is active");
        activeSprint = true;
    }
// конец спринта
    public void finishSprint(){
        System.out.println("Sprint is not active");
        activeSprint = false;
    }
}
