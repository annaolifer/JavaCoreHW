package Module5;


import java.util.Date;

public class TripAdvisorAPI implements API{

    static API api3 = new TripAdvisorAPI();

    Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        Room room1 = new Room(1, 300, 3, new Date(),"Hilton", "Rome");
        Room room2 = new Room(2, 1000, 1, new Date(), "Alisan", "Amsterdam");
        Room room3 = new Room(3, 900, 3, new Date(), "Avon", "New York");
        Room room4 = new Room(4, 400, 2, new Date(), "Blue", "Toronto");
        Room room5 = new Room(5, 500, 5, new Date(),"Blue", "Moscow");

        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
    }

   public Room[] findRooms(int price, int persons, String city, String hotel) {
        for (Room room : rooms) {
            if (room != null && room.getPrice() == price && room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)){
                return rooms;
            }
        }
        return null;
    }
}
