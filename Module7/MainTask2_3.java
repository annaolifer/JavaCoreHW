package Module7;


import java.util.*;

public class MainTask2_3 {
    public static void main(String[] args) {

    User user1 = new User(111,"Alla", "Khodzhayan", "Erevan", 14000);
    User user2 = new User(222,"Anna", "Milka", "Moscow", 100);
    User user3 = new User(333,"Alunika", "Dyban", "London", 10000);
    User user4 = new User(444,"Nazar", "Harlan", "Paris", 7000);
    User user5 = new User(555,"Andrey", "Petrov", "Milan", 4000);
    User user6 = new User(666,"Nataliya", "Matlan", "Prah", 700);
    User user7 = new User(777,"Anton", "Champion", "New York", 777000);
    User user8 = new User(888,"Nikita", "TarKan", "Paris", 900);
    User user9 = new User(999,"Dima", "Kravchuk", "Kyiv", 3000);
    User user10 = new User(112,"Oleg", "Censor", "Toronto", 1000);

   ArrayList<Order> orders = new ArrayList<>();

   orders.add(new Order(11, 400, Currency.getInstance("USD"),"A Red", "Bags and boots", user1));
   orders.add(new Order(22, 200, Currency.getInstance("USD"), "uK Big", "Bags", user2));
   orders.add(new Order(33, 700, Currency.getInstance("USD"), "C foot", "Bags and books", user3));
   orders.add(new Order(44, 100, Currency.getInstance("USD"), "F Pink", "Bags", user4));
   orders.add(new Order(66, 500, Currency.getInstance("USD"), "mkH Cool", "Bags and more bags", user6));
   orders.add(new Order(77, 900, Currency.getInstance("GBP"), "U Super", "Bags for champions", user7));
   orders.add(new Order(88, 700, Currency.getInstance("USD"), "C foot", "Bags and boots", user8));
   orders.add(new Order(99, 940, Currency.getInstance("RUB"), "A Red", "Bags", user9));
   orders.add(new Order(55, 1400,Currency.getInstance("UAH"), "Pink", "Bags and books", user5));
   orders.add(new Order(12, 1000,Currency.getInstance("UAH"), "F Pink", "Bags and books", user10));

// Сортировка за ценой заказа по убыванию:

        orders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }});

        for (Order Order:orders) {
            System.out.println("Order Price: " + Order.getPrice() + " " + "Order ID: " + Order.getId());
                    }
        System.out.println("=======================================================================");

// Сортировка за ценой заказа по возрастанию и за городом пользователя:

        orders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int compareResult = o1.getPrice() - o2.getPrice();
                if (compareResult == 0){
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
                return compareResult;
              }
        });

    for (Order Order:orders) {
            System.out.println("Order Price: " + Order.getPrice() + " " + "User city: " + Order.getUser().getCity());
            }
        System.out.println("=======================================================================");


// Сортировка за наименованием и идентификатором заказа, и городом пользователя:

        orders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int compareResult1 = o1.getItemName().compareTo(o2.getItemName());
                if (compareResult1 == 0){
                    int compareResult2 = o1.getId() - o2.getId();
                    if (compareResult2 == 0){
                        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                    }
                    return compareResult2;
                    }
                    return compareResult1;
                }
            });

        for (Order Order:orders) {
            System.out.println("Item Name: " + Order.getItemName() + " " + "ID: " + Order.getId() + " " +"User city: " + Order.getUser().getCity());
        }
        System.out.println("=======================================================================");


        //Task 3

        Set<Order> ordersSet = new TreeSet<>();

        ordersSet.add(new Order(11, 400, Currency.getInstance("USD"),"A Red", "Bags and boots", user1));
        ordersSet.add(new Order(22, 200, Currency.getInstance("USD"), "uK Big", "Bags", user2));
        ordersSet.add(new Order(33, 1200, Currency.getInstance("USD"), "C foot", "Bags and books", user3));
        ordersSet.add(new Order(44, 100, Currency.getInstance("USD"), "F Pink", "Bags", user4));
        ordersSet.add(new Order(66, 500, Currency.getInstance("USD"), "mkH Cool", "Bags and more bags", user5));
        ordersSet.add(new Order(77, 900, Currency.getInstance("GBP"), "U Super", "Bags for champions", user7));
        ordersSet.add(new Order(88, 700, Currency.getInstance("USD"), "C foot", "Bags and boots", user8));
        ordersSet.add(new Order(99, 940, Currency.getInstance("RUB"), "A Red", "Bags", user9));
        ordersSet.add(new Order(12, 1000,Currency.getInstance("UAH"), "F Pink", "Bags and books", user10));
        ordersSet.add(new Order(12, 1000,Currency.getInstance("UAH"), "F Pink", "Bags and books", user10));

        // Заказ c фамилией пользователя “Petrov”

        Iterator<Order> iterator1 = ordersSet.iterator();
        while (iterator1.hasNext()) {
            Order order = iterator1.next();
            if (order.getUser().getLastName().contains("Petrov")) System.out.println(order.toString());
           }
        System.out.println("=======================================================================");

         //Заказ с наибольшей ценой, исспользуя только один сет-метод - get:

               System.out.println(Collections.max(ordersSet));

        System.out.println("=======================================================================");

        // Удаление заказов в долларах используя Iterator:

        Iterator<Order> iterator2 = ordersSet.iterator();
        while (iterator2.hasNext()) {
            Order order2 = iterator2.next();
            if (order2.getCurrency().getCurrencyCode().contains("USD")) iterator2.remove();
                    }
        System.out.println(ordersSet);

    }
    }

