public class BeginnerApp {
  public static void main(String[] args) {
    String actorFirstName = "Gerard";
    String actorMiddleName = "James";
    String actorLastName = "Butler";
    int birthYear = 1969;
    String birthMonth = "November";
    int birthDay = 13;
    String[] movieTitles = {"Attila the Hun, 2001", "Coriolanus, 2011", "Mrs Brown, 1997", "Tomorrow Never Dies, 1997"};
    double[] movieRatings = {8.8, 7.8, 8.0, 8.2};

    int actorAge = 2025 - birthYear;

    System.out.println("The actor's name is: " + actorFirstName + " " + actorMiddleName + " " + actorLastName);
    System.out.println();

    System.out.println("The actor's birth year is: " + birthMonth + " " + birthDay + ", " + birthYear);
    System.out.println("His age is: " + actorAge + " years old");
    System.out.println();

//    Function to display movie titles
    System.out.println("The movies the actor has featured in are: ");
    for (String movieTitle : movieTitles) {
      System.out.println(movieTitle);
    }
    System.out.println();

//    Add movie ratings function to the title of the movie and print something like: "The Lord of th Rings: Fellowship of the Ring - amazing
    for (int i = 0; i < movieRatings.length; i++) {
      String movieDescription = movieRatingDescription(movieRatings[i]);
      System.out.println(movieTitles[i] + " - " + movieDescription);
    }
  }

//  Function for the movie ratings
  static String movieRatingDescription(double movieRating) {
    if (movieRating <= 5.0) {
      return "bad";
    } else if (movieRating > 5.0 && movieRating <= 6.5) {
      return "average";
    } else if (movieRating > 6.5 && movieRating <= 7.0) {
      return "good";
    } else if (movieRating > 7.0 && movieRating <= 8.0) {
      return "very good";
    } else {
      return "amazing";
    }
  }
}
