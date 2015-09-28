package org.dimigo.exception;

/**
 * Created by HIPERCUBE on 9/23/15.
 */
public class MovieTest {
    private static void buyTicket(Movie movie, int age) throws AgeCheckException {
        if (movie.getLimitAge() > age) throw new AgeCheckException(movie);
        else System.out.println(movie.getTitle() + " 즐감하세용~~");
    }

    public static void main(String[] args) {
        try {
            Movie[] movies = {new Movie("앤트맨", 12), new Movie("사도", 12), new Movie("베테랑", 15)};
            final int age = 13;
            for (Movie aMovie : movies) buyTicket(aMovie, age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
