public class ControlFlowApp {
  public static void main(String[] args) {
    boolean isDamaged = false;
    String carColor = "red";
    char energyEfficiencyCategory = 'Z';

    if (isDamaged) {
      System.out.println("The car is damaged");
    } else {
      System.out.println("The car is not damaged");
    }

    if (carColor.equals("red")) {
      System.out.println("The car color is red");
    } else if (carColor.equals("blue")) {
      System.out.println("The car color is blue");
    } else {
      System.out.println("The car color is unknown");
    }

    switch (energyEfficiencyCategory) {
      case 'A', 'B':
        System.out.println("Low energy consumption");
        break;
      case 'G':
        System.out.println("Medium energy consumption");
        break;
      default:
        System.out.println("High energy consumption");
    }
  }
}
