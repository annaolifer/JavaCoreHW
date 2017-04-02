package Module5;


import java.util.Date;

public class BookingComAPI implements API{

    static API api1 = new BookingComAPI();

    public Room[] rooms = new Room[5];

    public BookingComAPI() {
        Room room1 = new Room(1, 100, 1, new Date(),"Hilton", "Amsterdam");
        Room room2 = new Room(2, 300, 3, new Date(), "Hilton", "Rome");
        Room room3 = new Room(3, 900, 3, new Date(), "Avon", "New York");
        Room room4 = new Room(4, 600, 4, new Date(), "Blue", "Toronto");
        Room room5 = new Room(5, 400, 2, new Date(),"Blue", "Toronto");

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
