package lesson_4;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class TicketProvider {

    private final Map<Integer, Ticket[]> allTickets = new HashMap<>();
    private int places;

    public int getNumberOfRoutes() {
        return numberOfRoutes;
    }

    private int numberOfRoutes = 400; // количество маршрутов в сервисе

    public void updateTicketStatus(Ticket ticket) {
        ticket.setValid(false);
    }

    // создаем все доступные билеты в Map, где Integer это номер рейса и для каждого номера рейса у нас есть массив билетов
    public Map<Integer, Ticket[]> getAllTickets() {

        for (int i = 1; i < numberOfRoutes; i++) {
            allTickets.put(i, getTicketsRoute(i));
        }
        return allTickets;
    }

    public int getPlaces() {
        return places;
    }

    // метод возвращает билеты для одного маршрута
    private Ticket[] getTicketsRoute(int rout) {
        // количество мест в автобусе
        places = 41;
        Ticket[] tickets = new Ticket[places];
        for (int j = 1; j < tickets.length; j++) {
            tickets[j] = new Ticket(rout, j, LocalDate.now());
        }
        return tickets;
    }
}

