public class LoopsApp {
  public static void main(String[] args) {
//    WHILE loop
    System.out.println("WHILE loop");
    System.out.println("--------------------------------------------");
    int i = 0;
    while (i < 10) {
      System.out.println("Hello World! It's a while loop");
        i++;
    }
    System.out.println("Value of i: " + i);
    System.out.println();

//    FOR loop
    System.out.println("FOR loop");
    System.out.println("--------------------------------------------");
    for (int j = 0; j < 10; j++) {
      if (j == 5) {
        continue;
      }
      if (j == 7) {
        break;
      }
      System.out.println("Hello World! It's a FOR loop");
      if (j == 9) {
        System.out.println("Value of j: " + j);
      }
    }
    System.out.println();

    for (int j = 1; j <= 5; j++) {
      for (int k = 1; k <= 2; k++) {
        System.out.println("j=" + j + " k=" + k + " Hello World! It's a nested FOR loop");
      }
    }
    System.out.println();

//    DO-WHILE loop
    System.out.println("DO-WHILE loop");
    System.out.println("--------------------------------------------");
    int k = 0;
    do {
      System.out.println("Hello World! It's a DO-WHILE loop");
      k++;
    } while (k < 10);
    System.out.println("Value of k: " + k);
    System.out.println();
  }
}
