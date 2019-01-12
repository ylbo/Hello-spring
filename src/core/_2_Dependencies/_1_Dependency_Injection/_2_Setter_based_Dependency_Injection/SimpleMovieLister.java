package core._2_Dependencies._1_Dependency_Injection._2_Setter_based_Dependency_Injection;

import core._2_Dependencies._1_Dependency_Injection.MovieFinder;

public class SimpleMovieLister {

    // the SimpleMovieLister has a dependency on the MovieFinder
    private MovieFinder movieFinder;

    // a setter method so that the Spring container can inject a MovieFinder
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    // business logic that actually uses the injected MovieFinder is omitted...
}