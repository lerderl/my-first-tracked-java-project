public class FunctionApp {
  public static void main(String[] args) {
    sayHello();
    sayGoodbye(3);
    System.out.println("The price with 10% discount is: " + getTenPercentDiscount(100));
    System.out.println("The price with 50% discount is: " + getDiscount(100, 50));
    System.out.println("The price with 40% discount is: " + getDiscount(100.75, 40));
  }

  static void sayHello() {
    System.out.println("Hello World!");
  }

  static void sayGoodbye(int repeatTimes) {
    for (int i = 0; i < repeatTimes; i++) {
      System.out.println("Goodbye World!");
    }
  }

  static double getTenPercentDiscount(int price) {
    return price * 0.9;
  }

  static double getDiscount(int price, double discountPercentage) {
    return price * (1 - discountPercentage / 100);
  }

  static double getDiscount(double price, double discountPercentage) {
    return price * (1 - discountPercentage / 100);
  }

  static String getEnergyConsumptionLevel(char energyEfficiencyCategory) {
    char newEnergyEfficiencyCategory = Character.toUpperCase(energyEfficiencyCategory);

    if (newEnergyEfficiencyCategory == 'A') {
      return "Energy consumption level is very low";
    } else if (newEnergyEfficiencyCategory == 'B') {
      return "Energy consumption level is low";
    } else if (newEnergyEfficiencyCategory == 'C') {
      return  "Energy consumption level is normal";
    } else if (newEnergyEfficiencyCategory == 'D') {
      return "Energy consumption level is very above normal";
    } else if (newEnergyEfficiencyCategory == 'E') {
      return "Energy consumption level is high";
    } else if (newEnergyEfficiencyCategory == 'F') {
      return "Energy consumption level is very high";
    } else if (newEnergyEfficiencyCategory == 'G') {
      return "Energy consumption level is extremely high";
    } else {
      return "Invalid input";
    }
  }

  static String getCarDescription(String model, int year, String condition) {
    String modelYear = "This is car is a " + model + "\nProduction year: " + year;

    switch (condition) {
      case "good":
        return modelYear + "\nIt's in " + condition + " condition";
      case "bad":
        return modelYear + "\nIt's in " + condition + " condition";
      default:
        return modelYear + "\nIt's damaged";
    }
  }
}
