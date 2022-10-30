package lesson_4;

import java.util.Arrays;

public class Customer {

    public int id;
    private Ticket[] tickets;
    private int cash;

    public Customer(int id) {
        this.id = id;
        this.cash = 1000;
        this.tickets = new Ticket[10];
    }

    public Ticket[] getTickets() {
        return tickets;
    }


    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", tickets=" + Arrays.toString(tickets) +
                ", cash=" + cash +
                '}';
    }
}
