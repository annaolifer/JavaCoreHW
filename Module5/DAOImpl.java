package Module5;


public class DAOImpl implements DAO{

    Room[] roomDB = new Room[10];

   public Room save(Room room){
        int count = getRoomsCount(roomDB);

        roomDB [count] = room;

        return null;
    }

    private int getRoomsCount(Room[] roomDB) {
        int count = 0;
        for (Room room: roomDB) {
            if (room != null) {
                count++;
            }
        }
                return count;
            }

    public boolean delete(Room room){
        for (int i = 0; i < roomDB.length; i++) {
            Room roomInDB = roomDB[i];

            if (room.equals(roomInDB)){
                System.arraycopy(roomDB, i+1, roomDB, i, roomDB.length - i -1);
                roomDB[roomDB.length-1] = null;
            }
        }
        return true;
    }

    public Room update(Room room){
        return null;
    }

    public Room findById(long id){
        for (Room room : roomDB) {
           if (room != null && room.getId() == id){
               return room;
           }
        }
        return null;
    }
}
