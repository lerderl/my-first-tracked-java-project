public class MyFirstTrackedJavaApp {

    public static void main(String[] args) {
        System.out.println("November 7, 2024");

        int numberOfFollowers;  //  Variable Declaration
        numberOfFollowers = 910; // Variable Definition
        System.out.println(numberOfFollowers);

//        Variable Declaration and Definition on one line
        int numberOfLeaders = 13;
        System.out.println(numberOfLeaders);

//        Primitive types
        byte numberOfSeats = 5;
        byte numberOfDoors = 3;
        byte emissionSticker = 4;
        byte numberOfVehicleOwners = 1;

        short horsePower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6417;
        short powerInKilowatts = 362;

        int price = 29999;
        int mileage = 14999;

        long registrationNumber = 3981298793721L;

        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionExtraUrban = 13.6F;

        double fuelConsumptionPriceAverage = 15.2312513451;
        double fuelConsumptionPriceAverageMultipliedByTen = 1.52312513451e1;
        double fuelConsumptionPriceAverageDividedByTen = 152.312513451e-1;
        System.out.println(fuelConsumptionPriceAverageMultipliedByTen);
        System.out.println(fuelConsumptionPriceAverageDividedByTen);

        boolean isDamaged = true;

        char energyEfficiencyCategory = 'G';

        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: $" + price);
        System.out.println("Mileage: " + mileage + "km");
        System.out.println("The car is damaged: " + isDamaged);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Cubic Capacity: " + cubicCapacity + "ccm");
        System.out.println("Power: " + powerInKilowatts + "kW(" + horsePower + "hp)");
        System.out.println("CO2 emission: " + co2Emission + " g/km");
        System.out.println("Emission Sticker: " + emissionSticker + " ( Energy efficiency category: " +
                energyEfficiencyCategory + ")");
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + " l/100km");
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + " l/100km");
        System.out.println("Extra Urban fuel consumption: " + fuelConsumptionExtraUrban + " l/100km");
        System.out.println("Precise average fuel consumption: " + fuelConsumptionPriceAverage + " l/100km");
        System.out.println("Number of previous owners: " + numberOfVehicleOwners);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of seats: " + numberOfSeats);

//        Conversion
        System.out.println("---------------------------------");
        System.out.println("Conversion");
        short newNumberOfSeats = (short) (numberOfSeats * 2);
        System.out.println("The values of new number of seats: " + newNumberOfSeats);
        double newFuelConsumptionCombined = fuelConsumptionCombined * 2;
        System.out.println("The new value of combined fuel consumption: " + newFuelConsumptionCombined + "l/100km");

        byte newPowerInKilowatts = (byte) powerInKilowatts;
        System.out.println("The value of the new power: " + newPowerInKilowatts + "kW");
    }
}
