package HW9.task_6_13.utils;
import HW9.task_6_13.model.coffee.coffee_stock.PackagedCoffeeStock;
import java.util.ArrayList;


public class CoffeeSorter {

    public static void sort(ArrayList<PackagedCoffeeStock> packagedCoffeeStockArrayList) {
        packagedCoffeeStockArrayList.sort((s1, s2) -> {
            Double t1 = s1.getPackagedCoffee().getPrice() / s1.getPackagedCoffee().getProductWeight();
            Double t2 = s2.getPackagedCoffee().getPrice() / s2.getPackagedCoffee().getProductWeight();
            return t1.compareTo(t2);
        });

    }
}
