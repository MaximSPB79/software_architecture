package lesson_3.decorator;

// создадим класс задача в которой будут происходить динамические изменения задач для различных классов

public class Task {
    public static void main(String[] args) {

        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
