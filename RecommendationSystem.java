package keerthi;

import java.util.*;

public class RecommendationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Movie categories
        Map<String, List<String>> movies = new HashMap<>();

        movies.put("Action", Arrays.asList("Mad Max", "John Wick", "Avengers"));
        movies.put("Comedy", Arrays.asList("The Mask", "Jumanji", "Home Alone"));
        movies.put("Romance", Arrays.asList("Titanic", "Notebook", "La La Land"));
        movies.put("Horror", Arrays.asList("Conjuring", "IT", "Annabelle"));

        System.out.println("Welcome to Movie Recommendation System 🎬");
        System.out.println("Choose your favorite genre:");
        System.out.println("Action | Comedy | Romance | Horror");

        String choice = sc.nextLine();

        if (movies.containsKey(choice)) {
            System.out.println("\nRecommended Movies:");
            for (String movie : movies.get(choice)) {
                System.out.println("- " + movie);
            }
        } else {
            System.out.println("Sorry! Genre not found.");
        }

        sc.close();
    }
}
