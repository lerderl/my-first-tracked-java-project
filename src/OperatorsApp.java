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
    System.out.println("--------------------------------------------");

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

//    Equality and Relational Operators
    System.out.println("EQUALITY AND RELATIONAL OPERATORS");
    System.out.println("-------------------------------------------");
    System.out.println("Car's price equals the money in the bank: " + (price == moneyInTheBank));
    System.out.println("Car's price doesn't equal the money in the bank: " + (price != moneyInTheBank));
    System.out.println("Car's price greater than the money in the bank: " + (price > moneyInTheBank));
    System.out.println("Car's price less than the money in the bank: " + (price < moneyInTheBank));
    System.out.println("Car's price greater than or equals the money in the bank: " + (price >= moneyInTheBank));
    System.out.println("Car's price less than or equals the money in the bank: " + (price <= moneyInTheBank));
    System.out.println("The carName variable datatype is String: " + (carName instanceof String));
    System.out.println();

//    Ternary Operators
    System.out.println("TERNARY OPERATORS");
    System.out.println("-------------------------------------------");
    String damagedOrNot = isDamaged ? "Damaged" : "Not damaged";
    System.out.println("Is the car damaged? " + damagedOrNot);
    System.out.println();

//    Logical Operators
    System.out.println("LOGICAL OPERATORS");
    System.out.println("-------------------------------------------");
    String worthChecking = !isDamaged || price >= 10000 ? "Worth checking" : "Not worth checking";
    System.out.println("Is the car worth checking? " + worthChecking);
    String notWorthRepairing = isDamaged && price <= 10000 ? "Worth checking" : "Not worth repairing";
    System.out.println("Is the car worth repairing? " + notWorthRepairing);
    System.out.println();

//    Assignment Operators
    System.out.println("ASSIGNMENT OPERATORS");
    System.out.println("-------------------------------------------");
    price += 1000;
    System.out.println("Price of a " + carName + " after adding 1000: $" + price);
    price -= 1000;
    System.out.println("Price of a " + carName + " after subtracting 1000: $" + price);
    price *= 2;
    System.out.println("Price of a " + carName + " after multiplying by 2: $" + price);
    price /= 2;
    System.out.println("Price of a " + carName + " after dividing by 2: $" + price);
    price %= 2;
    System.out.println("Price of a " + carName + " after dividing by 2 and getting the remainder: $" + price);
  }
}
