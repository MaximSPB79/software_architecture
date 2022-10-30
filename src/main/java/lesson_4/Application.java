package lesson_4;

public class Application {
    public static void main(String[] args) {

        mainProcces();
    }

    public static void mainProcces() {
        Menu menu = new Menu();
        menu.menuDisplayAuthorization();
        menu.ticketBooking();
        menu.buyingProcess();
        menu.completionProcess();
    }
}