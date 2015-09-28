package org.dimigo.exception;

/**
 * Created by HIPERCUBE on 9/23/15.
 */
public class AgeCheckException extends Exception {
    public AgeCheckException() {
        super();
    }

    public AgeCheckException(Movie movie) {
        super(movie.getTitle() + "은/는 " + movie.getLimitAge() + "세 이상 관람가입니다.");
    }
}
