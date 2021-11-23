public class OperatorsApp {

    public static void main(String[] args) {

        String carModel = "DodgeChallenger SRT 392";
        int price = 14999;
        int moneyInTheBank = 100000;
        boolean isDamaged = true;

        System.out.println("Price of a " + carModel + ": euro " + price);

        int increasePrice = price + 1000;
        System.out.println("The increased price of a " + carModel + ": euro " + increasePrice);
        int decreasedPrice = price - 1000;
        System.out.println("The decreased price of a " + carModel + ": euro " + decreasedPrice);
        int twoCarsPrice = price * 2;
        System.out.println("Two " + carModel + ": euro " + twoCarsPrice);
        int dodgesYouCanBuy = moneyInTheBank / price;
        System.out.println("From the money we have in the bank we can buy " + dodgesYouCanBuy + " " + carModel);
        int moneyRemaining = moneyInTheBank % price;
        System.out.println("Money we would remain after buying " + dodgesYouCanBuy + " " + carModel + ": euro " + moneyRemaining);
        System.out.println();

        int priceNegative = -14999;
        int priceNegativeWithPlusSign = +priceNegative;
        System.out.println("Negative price with plus sign : euro " + priceNegativeWithPlusSign);
        int priceNegativeWithMinusSign = -priceNegative;
        System.out.println("Negative price with minus sign : euro " + priceNegativeWithMinusSign);
        int priceOneEuroIncrease = ++price;
        System.out.println("Price after 1 euro increase: euro " + priceOneEuroIncrease);
        int priceOneEuroDecrease = --price;
        System.out.println("Price after 1 euro decrease: euro " + priceOneEuroDecrease);
        System.out.println("This car is damaged: " + !isDamaged);
        System.out.println();

        System.out.println("Car' s price equals the money in the bank: " + (price == moneyInTheBank));
        System.out.println("Car' s price does not equals the money in the bank: " + (price != moneyInTheBank));
        System.out.println("Car' s price is greater than the money in the bank: " + (price > moneyInTheBank));
        System.out.println("Car' s price is lesser than the money in the bank: " + (price < moneyInTheBank));
        System.out.println("Car' s price is greater or equals than the money in the bank: " + (price >= moneyInTheBank));
        System.out.println("Car' s price is lesser or equals than the money in the bank: " + (price <= moneyInTheBank));
        System.out.println("The carModel variable' s datatype is a String: " + (carModel instanceof String));
        System.out.println();

        String damagedText = isDamaged ? "The car is damaged" : "The car isn' t damaged";
        System.out.println(damagedText);
        System.out.println();

        String worthSeeingText = !isDamaged || price <= 20000 ? "It' s worth seeing the car" : "It is not worth seeing the car";
        System.out.println(worthSeeingText);

        String worthrepairingText = isDamaged && price <= 10000 ? "It' s worth repairing the car" : "It is not worth repairing the car";
        System.out.println(worthrepairingText);
        System.out.println();

        price += 1000;
        System.out.println("Price increase: euro " + price);
        price -= 2000;
        System.out.println("Price decrease: euro " + price);
        price *= 2;
        System.out.println("Price multiplied: euro " + price);
        price /= 2;
        System.out.println("Price divided: euro " + price);
        price %= 10000;
        System.out.println("Price remained: euro " + price);

    }

}
