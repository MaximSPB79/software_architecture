package lesson_3.facade;

/**У нас имеется три сущности: работа, разработчик и трекер, который показывает состояние спринта. Каждый класс имеет
 * методы. Но мы их спрятали в классе Workflow, который и является фасадом. Имея один лишь метод он проделывает всю
 * работу под капотом и выводит нужный нам результат*/
public class SprintRunner {
    public static void main(String[] args) {
        Workflow workflow = new Workflow();
        workflow.solveProblems();
    }
}
