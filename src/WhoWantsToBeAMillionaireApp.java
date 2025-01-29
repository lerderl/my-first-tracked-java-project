public class WhoWantsToBeAMillionaireApp {
  public static void main(String[] args) {
    String question = "Who is named as the father of the light bulb?";
    String answer = "Thomas Edison";

    System.out.println(question);

    if (answer.equals("Nikola Tesla")) {
      System.out.println(answer + " You are wrong!");
    } else if (answer.equals("Marie Curie")) {
      System.out.println(answer  + " You are wrong!");
    } else if (answer.equals("Thomas Edison")) {
      System.out.println(answer + " You are correct!");
    } else if (answer.equals("Robert Oppenheimer")) {
      System.out.println(answer + " You are wrong!");
    } else {
      System.out.println("The correct answer is Thomas Edison");
    }
  }
}
