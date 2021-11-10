package HW9.task_6_13;
import static HW9.task_6_13.utils.PrepareData.createPackagedCoffees;
import java.util.*;
import HW9.task_6_13.model.coffee.CoffeeQuantity;
import HW9.task_6_13.model.coffee.PackagedCoffee;
import HW9.task_6_13.model.coffee.coffee_stock.PackagedCoffeeStock;
import HW9.task_6_13.model.van.Van;
import HW9.task_6_13.utils.CoffeeFinder;
import HW9.task_6_13.utils.CoffeeLoader;
import HW9.task_6_13.utils.CoffeeSorter;
import HW9.task_6_13.utils.SearchOptionsConst;

public class Task_6_13 {

    private static ArrayList<PackagedCoffee> mPackagedCoffeeArrayList = new ArrayList<>();
    private static int mVanVolume = 500;
    private static double mOrderCost = 10000;
    public static void main(String[] args) {
        mPackagedCoffeeArrayList = createPackagedCoffees();

        // System.out.println("================ All possible coffee ================");
        // for(PackagedCoffee packagedCoffee: mPackagedCoffeeArrayList) {
        //     System.out.println(packagedCoffee.toString());
        // }
        // System.out.println();

        System.out.println("================ Load van ================");
        Van van = new Van(500);
        CoffeeLoader.load(van, mOrderCost, mVanVolume, mPackagedCoffeeArrayList);

        for (PackagedCoffeeStock packagedCoffeeStock : van.getCargo()) {
            System.out.println(packagedCoffeeStock.getPackagedCoffee().toString() + " : " + packagedCoffeeStock.getNumber());
        }
        System.out.println();
        CoffeeSorter.sort(van.getCargo());

        System.out.println("================ Sort cargo ================");
        for(PackagedCoffeeStock packagedCoffeeStock: van.getCargo()) {
            System.out.println(packagedCoffeeStock.getPackagedCoffee().toString() + " : " +packagedCoffeeStock.getNumber());
        }
        System.out.println();

        Map map = new HashMap<String, String>();
        map.put(SearchOptionsConst.PRICE, Double.toString(100.0));
        map.put(SearchOptionsConst.COFFEE_QUANTITY, CoffeeQuantity.AB.name());

        System.out.println("============= Find coffee: cost > 100, Quantity only AB =============");
        Set<PackagedCoffee> list = CoffeeFinder.find(van.getCargo(), map);
        for(PackagedCoffee packagedCoffee: list) {
            System.out.println(packagedCoffee.toString());
        }
    }
}
