package HW9.task_6_13.utils;
import HW9.task_6_13.model.coffee.PackagedCoffee;
import HW9.task_6_13.model.coffee.coffee_stock.PackagedCoffeeStock;
import java.util.*;
import java.util.stream.Collectors;


public class CoffeeFinder {

    public static Set<PackagedCoffee> find(List<PackagedCoffeeStock> pPackagedCoffeeStockArrayList, Map<String, String> searchOption) {
        Set<PackagedCoffee> foundCoffeeSet = new HashSet<>();
        List<PackagedCoffee> tempCoffeePriceSearchOptionSet = new ArrayList<>();
        if (searchOption.containsKey(SearchOptionsConst.PRICE)) {
            tempCoffeePriceSearchOptionSet = pPackagedCoffeeStockArrayList.stream()
                    .map(PackagedCoffeeStock::getPackagedCoffee)
                    .filter(unit -> Double.parseDouble(searchOption.get(SearchOptionsConst.PRICE)) < unit.getPrice())
                    .collect(Collectors.toList());
        }
        List<PackagedCoffee> tempCoffeeQuantitySearchOptionSet = new ArrayList<>();
        if (searchOption.containsKey(SearchOptionsConst.COFFEE_QUANTITY)) {
            tempCoffeeQuantitySearchOptionSet = pPackagedCoffeeStockArrayList.stream()
                    .map(PackagedCoffeeStock::getPackagedCoffee)
                    .filter(unit -> searchOption.get(SearchOptionsConst.COFFEE_QUANTITY).equals(unit.getCoffee().getCoffeeInfo().getQuantity().name()))
                    .collect(Collectors.toList());
        }

        List<PackagedCoffee> tempCoffeePhysicalStateSearchOptionSet = new ArrayList<>();
        if (searchOption.containsKey(SearchOptionsConst.COFFE_PHYSICAL_STATE)) {
            tempCoffeePhysicalStateSearchOptionSet = pPackagedCoffeeStockArrayList.stream()
                    .map(PackagedCoffeeStock::getPackagedCoffee)
                    .filter(unit -> searchOption.get(SearchOptionsConst.COFFE_PHYSICAL_STATE).equals(unit.getCoffee().getCoffeeInfo().getPhysicalState().name()))
                    .collect(Collectors.toList());
        }

        foundCoffeeSet.addAll(tempCoffeePhysicalStateSearchOptionSet);
        foundCoffeeSet.addAll(tempCoffeePriceSearchOptionSet);
        foundCoffeeSet.addAll(tempCoffeeQuantitySearchOptionSet);

        if (searchOption.containsKey(SearchOptionsConst.PRICE)) {
            foundCoffeeSet.retainAll(tempCoffeePriceSearchOptionSet);
        }
        if (searchOption.containsKey(SearchOptionsConst.COFFE_PHYSICAL_STATE)) {
            foundCoffeeSet.retainAll(tempCoffeePhysicalStateSearchOptionSet);
        }
        if (searchOption.containsKey(SearchOptionsConst.COFFEE_QUANTITY)) {
            foundCoffeeSet.retainAll(tempCoffeeQuantitySearchOptionSet);
        }

        return foundCoffeeSet;
    }
}