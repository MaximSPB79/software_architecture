package lesson_4;

import java.time.LocalDate;


public class Ticket {

    public int rootNumber;
    public int place;
    public int price;
    public LocalDate date;
    public boolean isValid;

    public Ticket(int rootNumber, int place, LocalDate date) {
        this.rootNumber = rootNumber;
        this.place = place;
        this.price = 100;
        this.date = date;
        this.isValid = true; // означает что билет не куплен
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "rootNumber=" + rootNumber +
                ", place=" + place +
                ", price=" + price +
                ", date=" + date +
                ", status= " + getStatus() +
                '}';
    }
// метод возвращает статус билета
    private String getStatus() {
        return isValid ? "есть в наличии" : "продан";
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public int getPrice() {
        return price;
    }
}
