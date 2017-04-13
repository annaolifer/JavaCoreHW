package Module5;


public class Controller {

    API apis[] = new API[3];

    {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }


    Room[] requestRooms(int price, int persons, String city, String hotel) {


        Room[] api1 = apis[0].findRooms(price, persons, city, hotel);
        Room[] api2 = apis[1].findRooms(price, persons, city, hotel);
        Room[] api3 = apis[2].findRooms(price, persons, city, hotel);

        if (api1 != null && api2 != null && api3 != null) {
            Room[] createDB = new Room[api1.length + api2.length + api3.length];

            System.arraycopy(api1, 0, createDB, 0, api1.length);
            System.arraycopy(api2, 0, createDB, api1.length, api2.length);
            System.arraycopy(api3, 0, createDB, api1.length + api2.length, api3.length);

            return createDB;
        }
        return null;
    }

    Room[] check(Room[] api1, Room[] api2) {
        if (api1 != null && api2 != null) {
            int count = 0;
            for (int i = 0; i < api1.length; i++) {
                for (int j = 0; j < api2.length; j++) {
                    if (api1[i].equals(api2[j])) {
                        count++;
                    }
                }
            }
            Room[] sharedRooms = new Room[count];
            int index = 0;
            for (int i = 0; i < api1.length; i++) {
                for (int j = 0; j < api2.length; j++) {
                    if (api1[i].equals(api2[j])) {
                        sharedRooms[index++] = api1[i] = api2[j];
                    }
                }
            }
            return sharedRooms;
        }
        return null;

    }
}







