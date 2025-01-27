public class OperatorsApp {
  public static void main(String[] args) {
//    Arithmetic Operators
    System.out.println("ARITHMETIC OPERATORS");
    System.out.println("---------------------");
    String carName = "Dodge Challenger SRT 392";
    int price = 29999;
    int moneyInTheBank = 100000;
    boolean isDamaged = true;
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

//    Unary operators
    System.out.println();
    System.out.println("UNARY OPERATORS");
    System.out.println("---------------------");

    int priceNegative = -price;
    System.out.println("Negative price of a " + carName + " with plus sign: $" + priceNegative);
    int priceNegativeWithMinusSign = -priceNegative;
    System.out.println("Negative price of a " + carName + " with minus sign: $" + priceNegativeWithMinusSign);

    int priceIncrementByOne = ++price;
    System.out.println("Price of a " + carName + " incremented by 1: $" + priceIncrementByOne);
    int priceDecrementByOne = --price;
    System.out.println("Price of a " + carName + " decremented by 1: $" + priceDecrementByOne);

    System.out.println("Damaged?: " + !isDamaged);
    System.out.println();
  }
}
