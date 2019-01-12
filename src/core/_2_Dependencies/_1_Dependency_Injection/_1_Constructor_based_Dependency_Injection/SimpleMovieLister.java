package core._2_Dependencies._1_Dependency_Injection._1_Constructor_based_Dependency_Injection;

import core._2_Dependencies._1_Dependency_Injection.MovieFinder;

public class SimpleMovieLister {

    // the SimpleMovieLister has a dependency on a MovieFinder
    private MovieFinder movieFinder;

    // a constructor so that the Spring container can inject a MovieFinder
    public SimpleMovieLister(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    // business logic that actually uses the injected MovieFinder is omitted...
}