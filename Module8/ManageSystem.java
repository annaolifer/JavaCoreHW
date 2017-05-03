package Module8;


import java.util.*;

public final class ManageSystem <T extends Food> implements IManageSystem <T>{

    private Map<Food, Double> database = new HashMap<>();


    @Override
    public T save(T food, double price) {
        database.put (food, price);
        return food;
    }

    @Override
    public T save(T food) {
        database.put(food, null);
        return food;
    }

    @Override
    public void delete(T food) {
        database.remove(food);
    }

    @Override
    public void deleteById(int id) {
        Set<Food> set = database.keySet();
        set.removeIf ( t -> t.getId() == id );
    }

    @Override
    public Food get(int id) {
        Set<Food> set = database.keySet();
        for (Food food : set ) {
            if (food.getId ( ) == id)
                return food;
        }
        return null;
    }

    @Override
    public Double getPrice(T food) {
        return database.get(food);
    }

    @Override
    public Set<Food> getProducts() {
        return database.keySet();
    }

    @Override
    public List<Double> getPrices() {
        return new ArrayList<>(database.values());
    }

}
