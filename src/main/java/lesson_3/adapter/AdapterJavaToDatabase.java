package lesson_3.adapter;

// создаем класс адаптер, который позволит нашей программе JavaApplication взаимодействовать с базой данных и в методы
// интерфейса помещаем методы нашего приложения

public class AdapterJavaToDatabase extends JavaApplication implements DataBase {


    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
