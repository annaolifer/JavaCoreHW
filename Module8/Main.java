package Module8;


public class Main {

    public static void main(String[] args) {

        Food pizza = new Food("Pizza", Country.ITALY, 3);
        Food salo = new Food("Salo", Country.UKRAINE, 350);
        Food burger = new Food("Burger", Country.USA, 1);
        Food fuagra = new Food("Fuagra", Country.FRANCE, 2);
        Food insects = new Food("Insects", Country.CHINA, 15);

        ManageSystem menu = new ManageSystem();

        menu.save(pizza, 15.5);
        menu.save(salo);
        menu.save(burger, 5.5);
        menu.save(fuagra);
        menu.save(insects, 10.33);

        System.out.println("4th meal in menu is: " + menu.get(4));
        System.out.println("List of all the meals in menu: " + menu.getProducts());
        System.out.println("Prices of the meals in menu: " + menu.getPrices());
        System.out.println("Price of pizza is " + menu.getPrice(pizza));
        menu.delete(insects);
        System.out.println("List of meals without insects " + menu);
        menu.deleteById(3);
        System.out.println("List of meals without burger " + menu);


    }
}