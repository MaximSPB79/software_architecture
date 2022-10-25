package lesson_3.adapter;

// имеется интерфейс для работы с базой данных со стандартными методами

public interface DataBase {

    void insert();

    void update();

    void select();

    void remove();
}
