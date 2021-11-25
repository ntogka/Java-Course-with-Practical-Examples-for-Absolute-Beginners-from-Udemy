package advanced.objecthascode;

import java.util.Objects;

public class Pizza implements Cloneable{

    private String name;
    private PizzaSize pizzaSize;
    private double price;

    public Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        switch (pizzaSize) {
            case SMALL:
            default:
                return 5.99;
            case MEDIUM:
                return 7.99;
            case LARGE:
                return 10.99;
        }
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public double getPrice() {
        return price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Pizza)) {
            return false;
        }
        Pizza pizza = (Pizza) o;
        return  Objects.equals(pizza.name, name) && //name.equals(pizza.name)
                price == pizza.price &&
                pizzaSize == pizza.pizzaSize;

    }

    @Override
    public int hashCode() {
        // (the original) return Objects.hash(name, pizzaSize, price); same results
        int result = 7;

        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + (pizzaSize == null ? 0 : pizzaSize.hashCode());
        result = 31 * result + Double.valueOf(price).hashCode(); //(int) (price * 10000);
        //don't use random in hashing

        return result;
    }
}