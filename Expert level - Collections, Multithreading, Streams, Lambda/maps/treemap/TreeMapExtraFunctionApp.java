package expert.maps.treemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExtraFunctionApp {

    public static void main(String[] args) {

        TreeMap<String, Double> productPricesTreeMap = new TreeMap<>();
        productPricesTreeMap.put("Chocolate bar", 1.5);
        productPricesTreeMap.put("Pasta", 1.1);
        productPricesTreeMap.put("Cereals", 1.7);
        productPricesTreeMap.put("Apple", 0.15);
        productPricesTreeMap.put("Orange", 0.25);
        productPricesTreeMap.put("TeaBox", 3.2);

        System.out.println("The first product in the map: " + productPricesTreeMap.firstKey());
        System.out.println("TreeMap: ");
        for (String product : productPricesTreeMap.keySet()) {
            System.out.println(product + " $" + productPricesTreeMap.get(product)); //anapodi seira
        }

        System.out.println();
        System.out.println("Descending Map: ");
        NavigableMap<String, Double> productPriceDescendingMap = productPricesTreeMap.descendingMap();
        for (String product : productPriceDescendingMap.keySet()) {
            System.out.println(product + " $" + productPriceDescendingMap.get(product));
        }

        System.out.println();
        System.out.println("Lower key: " + productPricesTreeMap.lowerKey("Cereals"));
        System.out.println("Floor key: " + productPricesTreeMap.floorKey("Cereals"));
        System.out.println("Higher key: " + productPricesTreeMap.higherKey("Cereals"));
        System.out.println("Ceiling key: " + productPricesTreeMap.ceilingKey("Cereals"));

        System.out.println();
        System.out.println("Lower key: " + productPricesTreeMap.lowerKey("Shower gel")); //epistrefi kati kai as min iparxi
        System.out.println("Floor key: " + productPricesTreeMap.floorKey("Shower gel"));
        System.out.println("Higher key: " + productPricesTreeMap.higherKey("Shower gel"));
        System.out.println("Ceiling key: " + productPricesTreeMap.ceilingKey("Shower gel"));

        System.out.println();
        System.out.println("Poll first entry: " + productPricesTreeMap.pollFirstEntry()); //kanei remove
        System.out.println("The first entry: " + productPricesTreeMap.firstEntry());
        System.out.println("The last entry: " + productPricesTreeMap.lastEntry());

        System.out.println("Lower entry: " + productPricesTreeMap.lowerEntry("Pasta"));
        System.out.println("Floor entry: " + productPricesTreeMap.floorEntry("Pasta"));
        System.out.println("Higher entry: " + productPricesTreeMap.higherEntry("Pasta"));
        System.out.println("Ceiling entry: " + productPricesTreeMap.ceilingEntry("Pasta"));

        System.out.println();
        System.out.println("Tail map: " + productPricesTreeMap.tailMap("Orange", true));
        System.out.println("Head map: " + productPricesTreeMap.headMap("Orange", false));
        System.out.println("Sub map: " + productPricesTreeMap.subMap("Orange", true, "TeaBox", false));

    }

}
