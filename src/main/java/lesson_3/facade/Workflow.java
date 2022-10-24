package lesson_3.facade;

public class Workflow {

    // это и есть класс фасад, в котором мы определяем всю логику и создаем нужные нам объекты
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
