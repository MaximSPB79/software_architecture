package lesson_3.adapter;

// клиент для работы с базой данных, который использует для работы все методы нашего интерфейса

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDatabase();

        dataBase.select();
        dataBase.insert();
        dataBase.update();
        dataBase.remove();
    }
}
