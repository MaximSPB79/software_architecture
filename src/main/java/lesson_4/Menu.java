package lesson_4;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    CashProvider cashProvider = new CashProvider();
    TicketProvider ticketProvider = new TicketProvider();
    private Scanner scanner;
    private final Map<Integer, Ticket[]> listAllTickets = ticketProvider.getAllTickets();
    private Ticket ticket;
    private int rootNumber;
    private int placeNumber;

    public void menuDisplayAuthorization() {

        scanner = new Scanner(System.in);
        Greetings.greetings();
        System.out.println("Добро пожаловать, в он-лайн систему покупки билетов\n");
        System.out.println("Вы авторизированны в системе? (Y/N)");
        boolean flag = true;

        while (flag) {
            String answer = scanner.nextLine().trim().toUpperCase();
            switch (answer) {
                case "Y" -> {
                    System.out.println("Введите свой ID");
                    int idNumber = scanner.nextInt();
                    if (cashProvider.isAuthorisation(idNumber)) { // если находим юзера по id значит проверка успешна
                        System.out.println("Проверка выполнена успешно");
                    } else { // если юзера с таким id нет в системе, значит создаем его и добавляем в систему
                        System.out.println("Пользователь с таким ID не найден.\nПройдите авторизацию");
                        displayMooving(getName());
                    }
                    flag = false;
                }
                case "N" -> {
                    System.out.println("Пройдите авторизацию");
                    displayMooving(getName());
                    flag = false;
                }
                default -> System.out.println("Неверный символ, введите Y или N");
            }
        }
    }

    private String getName() {
        System.out.println("Введите свое имя");
        return scanner.nextLine();
    }

    // сообщение об успешной авторизации
    private void displayMooving(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("* ");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n" + name + ", авторизация прошла успешна, ваш ID: " + cashProvider.createNewUser().getId());
    }

    // метод бронирует выбранный билет
    public void ticketBooking() {
        rootNumber = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("Введите номер нужного рейса автобуса");
            rootNumber = scanner.nextInt();
            if (rootNumber > ticketProvider.getNumberOfRoutes()) {
                System.out.println("Такого рейса не существует");
            } else {
                flag = false;
            }
        }
        System.out.println("Вы видите список всех доступных билетов:\n");
        Arrays.stream(listAllTickets.get(rootNumber)).forEach(System.out::println);

        placeNumber = 0;
        flag = true;
        while (flag) {
            System.out.println("Введите номер места:");
            placeNumber = scanner.nextInt();
            if (placeNumber > ticketProvider.getPlaces()) {
                System.out.println("Такого места нет");
            } else if (!listAllTickets.get(rootNumber)[placeNumber].isValid) {
                System.out.println("Билет на это место уже куплен, выберите другое место ");
            } else {
                flag = false;
            }
        }
        ticket = listAllTickets.get(rootNumber)[placeNumber];
        ticketProvider.updateTicketStatus(ticket);
        System.out.println("Билет на рейс " + rootNumber + " и место " + placeNumber + " забронирован");
    }

    // процесс покупки билета
    public void buyingProcess() {
        System.out.println("Оплатите пожалуйста покупку\n");
        System.out.println("Введите номер вашей карты");
        String numberCard = scanner.nextLine();
        while (numberCard.length() != 16) {
            System.out.println("Номер карты неверный, повторите попытку:");
            numberCard = scanner.nextLine();
        }
        System.out.println("С вашей карты спишется " + ticket.getPrice() + " рублей");
        if (ticket.getPrice() <= cashProvider.getCustomer().getCash()) {
            cashProvider.getCustomer().setCash(cashProvider.getCustomer().getCash() - ticket.getPrice());
            cashProvider.buy(ticket);
            cashProvider.getCustomer().getTickets()[0] = ticket;
        } else {
            System.out.println("Недостаточно средств на счету, пополните свой счет и продолжите операцию");
        }
    }

    // завершение операции
    public void completionProcess() {
        System.out.println("Операция успешно завершена");
        System.out.println("Билет на рейс " + rootNumber + " и место " + placeNumber + " оплачен");
        System.out.println("Спасибо, что используете наш сервис");
    }
}

