public class CarDescription {
  public static void main(String[] args) {
    System.out.println(getCarDescription("BMW", 2020, "good"));
  }

  static String getCarDescription(String model, int year, String condition) {
    return FunctionApp.getCarDescription(model, year, condition);
  }
}
