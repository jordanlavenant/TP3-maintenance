package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import app.Movie;

public class MovieTest {

    @Test
    public void testGetTitle() {
        Movie movie = new Movie("The Godfather", Movie.REGULAR);
        assertEquals("The Godfather", movie.getTitle());
    }

    @Test
    public void testGetPriceCode() {
        Movie movie = new Movie("The Godfather", Movie.REGULAR);
        assertEquals(Movie.REGULAR, movie.getPriceCode());
    }

    @Test
    public void testSetPriceCode() {
        Movie movie = new Movie("The Godfather", Movie.REGULAR);
        movie.setPriceCode(Movie.NEW_RELEASE);
        assertEquals(Movie.NEW_RELEASE, movie.getPriceCode());
    }
}
