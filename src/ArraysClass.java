public class ArraysClass {
  public static void main(String[] args) {
    int[] lotteryNumbers = new int[5];

    lotteryNumbers[0] = 1;
    lotteryNumbers[1] = 2;
    lotteryNumbers[2] = 3;
    lotteryNumbers[3] = 4;
    lotteryNumbers[4] = 5;

    for (int lotteryNumber: lotteryNumbers) {
      System.out.println(lotteryNumber);
    }
    System.out.println();

//    int[][] weeklyLotteryNumbers = new int[5][7];
    int[][] weeklyLotteryNumbers = {
        {1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25},
    };

    for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
      for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {
        System.out.print(weeklyLotteryNumbers[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();

//    Enhanced for
    System.out.println("ENHANCED FOR LOOP");
    for (int[] weeklyLotteryNumber : weeklyLotteryNumbers) {
      for (int i : weeklyLotteryNumber) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
}
