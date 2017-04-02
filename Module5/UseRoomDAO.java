package Module5;


import java.util.Date;

public class UseRoomDAO {
    public static void main(String[] args) {

        DAOImpl roomDAO = new DAOImpl();

        for (int i = 1; i < 11; i++) {
            Room room = createRoom(i - 1, 100 * i,i); // creating 10 different rooms
            roomDAO.save(room); // saving 10 rooms into roomDAO
        }

        roomDAO.delete(createRoom(0, 200, 2));
        roomDAO.delete(createRoom(0, 700, 7));

        for (int i = 0; i < 10; i++) {
            Room room = roomDAO.findById(i);
            if (room == null) {
                System.out.println("No room with id:" + i);
            } else {
                System.out.println("Room from DB:" + room.getId() + " Price: " + room.getPrice());
            }
        }
    }

    private static Room createRoom(long id, int price, int persons) {
        Room room1 = new Room();
        room1.setPrice(price);
        room1.setPersons(persons);
        room1.setId(id);
        room1.setCityName("Kiev");
        room1.setHotelName("Aleksa");
        room1.setDateAvailableFrom(new Date());

        return room1;
    }
}


