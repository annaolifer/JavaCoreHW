package Module8;


public class Food {

   private long id;
   private String name;
   private Country country;
   private int expiration; //(срок годности в днях)

    //Идентификатор id должен быть недоступен для изменения и генерироваться с помощью IdGenerator при создании товара.

    public Food(String name, Country country, int expiration) {
        id = IdGenerator.idGenerator();
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return id == food.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "ID:_" + id + "_Type_of_food:_" + name + "_Country:_" + country + "_Expiration_days:_" + expiration;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }



}
