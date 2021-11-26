package expert.sets.enumset;

import java.util.EnumSet;

public class EnumSetApp {

    enum PizzaSize {
        SMALL, MEDIUM, LARGE, EXTRA_LARGE, FAMILY
    }

    public static void main(String[] args) {

        EnumSet<PizzaSize> pizzaSizes = EnumSet.allOf(PizzaSize.class);
        System.out.println("Available pizza sizes: " + pizzaSizes);

        /*EnumSet<PizzaSize> basicPizzaSizes = EnumSet.noneOf(PizzaSize.class);
        basicPizzaSizes.add(PizzaSize.SMALL);
        basicPizzaSizes.add(PizzaSize.MEDIUM);
        basicPizzaSizes.add(PizzaSize.LARGE);
        System.out.println("Basics pizza sizes: " + basicPizzaSizes);*/

        EnumSet<PizzaSize> basicPizzaSizes = EnumSet.of(PizzaSize.SMALL, PizzaSize.MEDIUM, PizzaSize.LARGE);
        System.out.println("Basics pizza sizes: " + basicPizzaSizes); //idio apotelesma me to pano

        EnumSet<PizzaSize> middlePizzaSizes = EnumSet.range(PizzaSize.MEDIUM, PizzaSize.EXTRA_LARGE);
        System.out.println("Middle pizza sizes: " + middlePizzaSizes);


    }

}
