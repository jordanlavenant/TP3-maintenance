package tests;

import app.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {

    @Test
    void testRegularMovieCharge() {
        Movie movie = new Movie("The Godfather", Movie.REGULAR);
        assertEquals(2.0, movie.getCharge(2));
        assertEquals(3.5, movie.getCharge(3));
    }

    @Test
    void testNewReleaseMovieCharge() {
        Movie movie = new Movie("Avengers: Endgame", Movie.NEW_RELEASE);
        assertEquals(6.0, movie.getCharge(2));
    }

    @Test
    void testChildrenMovieCharge() {
        Movie movie = new Movie("Frozen", Movie.CHILDRENS);
        assertEquals(1.5, movie.getCharge(3));
        assertEquals(3.0, movie.getCharge(4));
    }

    @Test
    void testFrequentRenterPoints() {
        Movie newRelease = new Movie("Avengers: Endgame", Movie.NEW_RELEASE);
        assertEquals(1, newRelease.getFrequentRenterPoints(1));
        assertEquals(2, newRelease.getFrequentRenterPoints(2));
    }

    @Test
    void testMoviePriceCodeChange() {
        Movie movie = new Movie("The Godfather", Movie.REGULAR);
        movie.setPriceCode(Movie.NEW_RELEASE);
        assertEquals(9.0, movie.getCharge(3));
    }

    @Test
    void testInvalidPriceCode() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Movie("Invalid Movie", 999);
        });
        assertEquals("Invalid price code", exception.getMessage());
    }
}
