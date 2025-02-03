import java.util.Arrays;

public class IMDBApp {
  public static void main(String[] args) {
    String actorName = "Tom Cruise";
    int yearOfBirth = 1990;
    int age = 2025 - yearOfBirth;

    String[] movieTitles = {
        "The Last Samurai", "Minority Report", "Top Gun", "Rain Man", "Cocktail", "The Mummy", "American Made"
    };

    float[] movieRatings = {
        7.7f, 7.6f, 6.9f, 8.0f, 5.9f, 5.4f, 7.1f
    };

    System.out.println("Actor Name: " + actorName);
    System.out.println("Year of Birth: " + yearOfBirth);
    System.out.println("Age: " + age + " years old");

    System.out.println("Movie Titles: " + Arrays.toString(movieTitles));

    System.out.println("Movie Titles");
    for (int i = 0; i < movieTitles.length; i++) {
      System.out.println(movieTitles[i] + " - " + getRatingDescription(movieRatings[i]));
    }
  }

  static String getRatingDescription(float movieRating) {
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
