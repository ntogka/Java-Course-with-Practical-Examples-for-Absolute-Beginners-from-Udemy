package intermediate.polymorfism.car;

public class DodgeChallenger extends Car implements ElectricMode {

    DodgeChallenger(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity,
                    int price, int mileage, boolean isDamaged){
        super("Dodge Challenger", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
    }


    @Override
    public void startTheEngine() {
        System.out.println("A Dodge Challenger is started.");
    }

    @Override
    public void startTheElectricMode() {
        System.out.println("Dodge Challenger starts its electic engine");
    }
}
