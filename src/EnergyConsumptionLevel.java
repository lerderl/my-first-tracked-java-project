public class EnergyConsumptionLevel {
  public static void main(String[] args) {
    System.out.println(getEnergyConsumptionLevel('A'));
    System.out.println(getEnergyConsumptionLevel('b'));
    System.out.println(getEnergyConsumptionLevel('H'));;
  }

  static String getEnergyConsumptionLevel(char energyEfficiencyCategory) {
    return FunctionApp.getEnergyConsumptionLevel(energyEfficiencyCategory);
  }
}
