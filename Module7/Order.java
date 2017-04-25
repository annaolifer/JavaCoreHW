package Module7;

import java.util.Currency;

public class Order implements Comparable<Order> {
    @Override
    public int compareTo(Order o) {
        return price - o.getPrice();
    }

   private int id;
   private int price;
   private Currency currency;
   private String itemName;
   private String shopIdentificator;
   private User user;

 Order (int id, int price, Currency currency, String itemName, String shopIdentificator,User user){
    this.id = id;
    this.price = price;
    this.currency = currency;
    this.itemName = itemName;
    this.shopIdentificator = shopIdentificator;
    this.user = user;
  }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
       return "Order_ID: " + getId() + " " + "User_surname: " + getUser().getLastName() + " " + "Currency: " + getCurrency();
    }
}
