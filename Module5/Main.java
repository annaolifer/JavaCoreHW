package Module5;


public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();


        System.out.println("Requested rooms 1: " + controller.requestRooms(400, 2, "Toronto", "Blue"));
        System.out.println("Requested rooms 2: " + controller.requestRooms(300, 3, "Rome", "Hilton"));
        System.out.println("Requested rooms 2: " + controller.requestRooms(900, 3, "New York", "Avon"));


        System.out.println("Shared rooms Booking vs. Google: " + controller.check(BookingComAPI.api1.findRooms(400, 2, "Toronto", "Blue"), GoogleAPI.api2.findRooms(400, 2, "Toronto", "Blue")) );
        System.out.println("Shared rooms Booking vs. TripAdvisor: " + controller.check(BookingComAPI.api1.findRooms(400, 2, "Toronto", "Blue"), TripAdvisorAPI.api3.findRooms(400, 2, "Toronto", "Blue")));
        System.out.println("Shared rooms Google vs. TripAdvisor: " + controller.check(GoogleAPI.api2.findRooms(400, 2, "Toronto", "Blue"),TripAdvisorAPI.api3.findRooms(400, 2, "Toronto", "Blue")));
    }
}
