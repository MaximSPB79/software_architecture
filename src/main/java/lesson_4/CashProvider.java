package lesson_4;

import java.util.ArrayList;
import java.util.List;


public class CashProvider {

    public long card;
    public List<Customer> customers = new ArrayList<>();
    private int cash = 0;
    private Customer customer;

    public Customer getCustomer() {
        return createNewUser();
    }

    public void buy(Ticket ticket) {
        cash += ticket.getPrice();
    }

    // создаем нового пользователя и добавляем его в список
    public Customer createNewUser() {
        int id = (int) (Math.random() * Integer.MAX_VALUE);
        customer = new Customer(id);
        customers.add(customer);
        return customer;
    }

    // проверяем список пользователей по ID
    public boolean isAuthorisation(int id) {
        for (Customer customer : customers) {
            if (id == customer.getId()) {
                return true;
            }
        }
        return false;
    }
}
