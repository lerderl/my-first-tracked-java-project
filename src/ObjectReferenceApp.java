public class ObjectReferenceApp {
  public static void main(String[] args) {
    DodgeChallenger redDodgeChallenger = new DodgeChallenger();
    DodgeChallenger greenDodgeChallenger = new DodgeChallenger();

    System.out.println(redDodgeChallenger);
    System.out.println(greenDodgeChallenger);

    byte numberOfSeats = 5;
    short horsePower = 492;
    int price = 29999;
    long registrationNumber = 3981298793721L;

    float fuelConsumptionCombined = 15.5F;
    double fuelConsumptionPriceAverage = 15.2312513451;

    boolean isDamaged = true;
    char energyEfficiencyCategory = 'G';

    String carName = "Dodge Challenger SRT 392";
    String carNameNew = "Dodge Challenger SRT 492";

    System.out.println("Number of seats: " + numberOfSeats);
    System.out.println("Horsepower: " + horsePower);
    System.out.println("Price: $" + (float) price);
    System.out.println("Registration Number: " + registrationNumber);
    System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + "l/100km");
    System.out.println("Price average: $" + (int) fuelConsumptionPriceAverage);
    System.out.println("This car is damaged: " + isDamaged);
    System.out.println("Energy efficiency category: " + energyEfficiencyCategory);

    System.out.println("Car name: " + carName);
    System.out.println("Car name with uppercase: " + carName.toUpperCase());
    System.out.println("Car name with lowercase: " + carName.toLowerCase());
    System.out.println("New car name: " + carNameNew);
  }
}
