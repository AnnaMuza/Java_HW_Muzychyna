package HW9.task_6_13.utils;
import HW9.task_6_13.model.coffee.PackagedCoffee;
import HW9.task_6_13.model.coffee.coffee_stock.PackagedCoffeeStock;
import HW9.task_6_13.model.van.Van;
import java.util.*;
import java.util.stream.Collectors;


public class CoffeeLoader {

    public static void load(Van pVan, double pOrderCoast, int pVanVolume, List<PackagedCoffee> pPackagedCoffeeArrayList) {
        ArrayList<PackagedCoffeeStock> packagedCoffeeStockArrayList = new ArrayList<>();
        int sizePackagedCoffee = pPackagedCoffeeArrayList.size();
        int tempVolume = 0;
        double tempCoast = 0.0;
        Random random = new Random(new Date().getTime());
        while (tempVolume < pVanVolume && tempCoast < pOrderCoast) {
            packagedCoffeeStockArrayList.add(new PackagedCoffeeStock(pPackagedCoffeeArrayList.get(random.nextInt(sizePackagedCoffee)),
                    1));
            tempVolume += packagedCoffeeStockArrayList.get(packagedCoffeeStockArrayList.size() - 1).getPackagedCoffee().getPackaging().getVolume();
            tempCoast += packagedCoffeeStockArrayList.get(packagedCoffeeStockArrayList.size() - 1).getPackagedCoffee().getPrice();
        }
        if (!packagedCoffeeStockArrayList.isEmpty()) {
            packagedCoffeeStockArrayList.remove(packagedCoffeeStockArrayList.size() - 1);

            packagedCoffeeStockArrayList.stream().collect(Collectors.groupingBy(p -> p.getPackagedCoffee(), Collectors.counting()))
                    .entrySet().stream()
                    .forEach(key -> pVan.getCargo().add(new PackagedCoffeeStock(key.getKey(), key.getValue().intValue())));

        }
    }
}
