package HW9.task_6_13.utils;
import java.util.ArrayList;
import HW9.task_6_13.NameConst;
import HW9.task_6_13.model.coffee.CoffeeInfo;
import HW9.task_6_13.model.coffee.CoffeePhysicalState;
import HW9.task_6_13.model.coffee.CoffeeQuantity;
import HW9.task_6_13.model.coffee.PackagedCoffee;
import HW9.task_6_13.model.coffee.coffee_type.BlendedCoffee;
import HW9.task_6_13.model.coffee.coffee_type.Coffee;
import HW9.task_6_13.model.packaging.Packaging;
import HW9.task_6_13.model.packaging.PackagingSize;
import HW9.task_6_13.model.packaging.PackagingType;


public class PrepareData {

    public static ArrayList<PackagedCoffee> createPackagedCoffees() {
        ArrayList<PackagedCoffee> packagedCoffees = new ArrayList<>();

        CoffeeInfo coffee1 = new CoffeeInfo(NameConst.ARABICA, CoffeePhysicalState.COFFEE_BEANS, CoffeeQuantity.AA);
        CoffeeInfo coffee2 = new CoffeeInfo(NameConst.LIBERICA, CoffeePhysicalState.GROUND_COFFEE, CoffeeQuantity.AB);
        CoffeeInfo coffee3 = new CoffeeInfo(NameConst.ROBUSTA, CoffeePhysicalState.INSTANT_COFFEE, CoffeeQuantity.BB);

        CoffeeInfo coffee4 = new CoffeeInfo(NameConst.ARABICA, CoffeePhysicalState.GROUND_COFFEE, CoffeeQuantity.AA);
        CoffeeInfo coffee5 = new CoffeeInfo(NameConst.LIBERICA, CoffeePhysicalState.INSTANT_COFFEE, CoffeeQuantity.BA);
        CoffeeInfo coffee6 = new CoffeeInfo(NameConst.ROBUSTA, CoffeePhysicalState.COFFEE_BEANS, CoffeeQuantity.AB);

        CoffeeInfo coffee7 = new CoffeeInfo(NameConst.ARABICA, CoffeePhysicalState.INSTANT_COFFEE, CoffeeQuantity.AA);
        CoffeeInfo coffee9 = new CoffeeInfo(NameConst.ROBUSTA, CoffeePhysicalState.GROUND_COFFEE, CoffeeQuantity.AB);

        BlendedCoffee product1 = new BlendedCoffee(NameConst.NESCAFE_BARISTA, coffee2, coffee3);
        BlendedCoffee product2 = new BlendedCoffee(NameConst.JACOBS_BARISTA, coffee4, coffee5);
        BlendedCoffee product3 = new BlendedCoffee(NameConst.TCHIBO_BARISTA, coffee7, coffee9);

        Coffee product4 = new Coffee(NameConst.NESCAFE, coffee1);
        Coffee product5 = new Coffee(NameConst.JACOBS, coffee6);

        ArrayList<Coffee> coffees = new ArrayList<>();
        coffees.add(product1);
        coffees.add(product2);
        coffees.add(product3);
        coffees.add(product4);
        coffees.add(product5);

        ArrayList<Packaging> packagings = new ArrayList<>();
        for (PackagingSize size : PackagingSize.values()) {
            for (PackagingType type : PackagingType.values()) {
                packagings.add(new Packaging(type, size));
            }
        }

        for (Coffee coffee : coffees) {
            for (Packaging packaging : packagings) {
                packagedCoffees.add(new PackagedCoffee(coffee, packaging));
            }
        }
        return packagedCoffees;
    }
}
