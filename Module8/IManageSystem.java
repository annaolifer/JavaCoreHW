package Module8;

import java.util.List;
import java.util.Set;

public interface IManageSystem <T> {
    T save(T obj, double price);
    T save(T obj);
    void delete(T obj) ;
    void deleteById(int id);
    Food get(int id);
    Double getPrice(T obj);
    Set<Food> getProducts();
    List<Double> getPrices();

}
