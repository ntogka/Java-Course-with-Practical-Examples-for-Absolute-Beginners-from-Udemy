package intermediate.classesandobjects;

import java.util.Random;

public class DodgeChallenger {

    byte numberOfSeats = 5;
    byte numberOfDoors = 3;
    byte numberOfVehicleOwners = 1;
    byte emissionSticker = 4;

    short power = 362;
    short horsePower = 492;
    short co2Emission = 333;
    short cubicCapacity = 6417;

    int price = 29999;
    int mileage = 14999;

    long registrationNumber = 232513521545258L;

    float fuelConsumptionCombined = 15.5F;
    float fuelConsumptionUrban = 21.4F;
    float fuelConsumptionExtraUrban = 13.6F;

    double fuelConsumptionPreciseAverage = 152.3855455224565245e-1;

    boolean isDamaged = true;

    char energyEfficiencyCategory = 'G';

    String color;


    DodgeChallenger(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity,
                    int price, int mileage, boolean isDamaged){
        this.color = color;
        this.numberOfVehicleOwners = numberOfVehicleOwners;
        this.power = power;
        this.horsePower = horsePower;
        this.cubicCapacity = cubicCapacity;
        this.price = price;
        this.mileage = mileage;
        this.isDamaged = isDamaged;
        Random randomNumberGenerator = new Random();
        this.registrationNumber = randomNumberGenerator.nextLong();
        }

    public void startTheEngine(){
        System.out.println("The engine is started.");
    }

    public void getDescription(){
        System.out.println("An " + color + " Dodge Challenger is created.");
        System.out.println("Price: " + price + " euro");
        System.out.println("Mileage: " + mileage + " km");
        System.out.println("The car is Damaged: " + isDamaged);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Cubic capacity: " + cubicCapacity + " ccm");
        System.out.println("Power: " + power + "kW(" + horsePower + " hp)");
        System.out.println("CO2 emission: " + co2Emission + " g/km");
        System.out.println("Emission sticker: " + emissionSticker + " (Energy efficiency category: " + energyEfficiencyCategory + ")");
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + " l/100km");
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + " l/100km");
        System.out.println("Extra urban fuel consumption: " + fuelConsumptionExtraUrban + " l/100km");
        System.out.println("Precise average fuel consumption: " + fuelConsumptionPreciseAverage + " l/100km");
        System.out.println("Number of previous owners: " + numberOfVehicleOwners);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of seats: " + numberOfSeats);
    }

}
