package Module5;


import java.util.Date;

public class Room {
   private long id;
   private int price;
   private int persons;
   private Date dateAvailableFrom;
   private String hotelName;
   private String cityName;

   Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName){
       this.id = id;
       this.price = price;
       this.persons = persons;
       this.dateAvailableFrom = dateAvailableFrom;
       this.hotelName = hotelName;
       this.cityName = cityName;
   }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Room room = (Room) obj;
        return price == room.price && persons == room.persons && cityName.equals(room.cityName);
        }

   @Override
    public int hashCode() {
       int result = 17;
       result = 37 * result + price;
       result = 37 * result + persons;
       result = 37 * result + (cityName == null ? 0 : cityName.hashCode());
       return result;
    }

 // Getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
