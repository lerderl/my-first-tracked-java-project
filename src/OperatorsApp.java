public class OperatorsApp {
  public static void main(String[] args) {
//    Arithmetic Operators
    System.out.println("ARITHMETIC OPERATORS");
    System.out.println("---------------------");
    String carName = "Dodge Challenger SRT 392";
    int price = 29999;
    int moneyInTheBank = 100000;
    boolean isDamaged = true;
    System.out.println(isDamaged);
    int newMoneyInTheBank = moneyInTheBank + price;

    System.out.println("New money in the bank: $" + newMoneyInTheBank);
    System.out.println(("Price of a " + carName + ": $" + price));

    int increasedPrice = price + 1000;
    System.out.println("Increased price of a " + carName + ": $" + increasedPrice);
    int decreasedPrice = price - 1000;
    System.out.println("Decreased price of a " + carName + ": $" + decreasedPrice);
    int doublePrice = price * 2;
    System.out.println("Double price of a " + carName + ": $" + doublePrice);
    int noOfCarsYouCanBuy = moneyInTheBank / price;
    System.out.println("Number of cars you can buy: " + noOfCarsYouCanBuy + " " + carName + "s");
    int moneyLeft = moneyInTheBank % price;
    System.out.println("Money left after buying " + noOfCarsYouCanBuy + " " + carName + "s: $" + moneyLeft);


  }
}
