public class ObjectReferenceApp {
  public static void main(String[] args) {
    DodgeChallenger redDodgeChallenger = new DodgeChallenger();
    DodgeChallenger greenDodgeChallenger = new DodgeChallenger();

    Byte numberOfSeats = 5;
    Short horsePower = 492;
    Integer price = 29999;
    Long registrationNumber = 3981298793721L;

    Float fuelConsumptionCombined = 15.5F;
    Double fuelConsumptionPriceAverage = 15.2312513451;

    Boolean isDamaged = true;
    Character energyEfficiencyCategory = 'G';

    String carName = "Dodge Challenger SRT 392";
    String carNameNew = new String("Dodge Challenger SRT 392");

    System.out.println("Number of seats: " + numberOfSeats);
    System.out.println("Horsepower: " + horsePower);
    System.out.println("Price: $" + price.floatValue());
    System.out.println("Registration Number: " + registrationNumber);
    System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + "l/100km");
    System.out.println("Price average: $" + fuelConsumptionPriceAverage.intValue());
    System.out.println("This car is damaged: " + isDamaged);
    System.out.println("Energy efficiency category: " + energyEfficiencyCategory);

    System.out.println("Car name: " + carName);
    System.out.println("Car name with uppercase: " + carName.toUpperCase());
    System.out.println("Car name with lowercase: " + carName.toLowerCase());
    System.out.println("Car name and car name with new keyword are equals: " + carName.equals(carNameNew));
    System.out.println("New car name: " + carNameNew);
  }
}
