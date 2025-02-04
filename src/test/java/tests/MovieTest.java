package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.ChildrensMovie;
import app.Movie;
import app.NewReleaseMovie;
import app.RegularMovie;

public class MovieTest {

    private Movie movie1;
    private Movie movie2;
    private Movie movie3;

    @BeforeEach
    void setUp() {
        movie1 = new RegularMovie("Regular Movie");
        movie2 = new NewReleaseMovie("NewRelease Movie");
        movie3 = new ChildrensMovie("Childrens Movie");
    }

    @Test
    public void testGetTitle() {
        assertEquals("Regular Movie", movie1.getTitle());
        assertEquals("NewRelease Movie", movie2.getTitle());
        assertEquals("Childrens Movie", movie3.getTitle());
    }

    @Test
    public void testGetFrequentRenterPoints() {
        assertEquals(1, movie1.getFrequentRenterPoints(5));
        assertEquals(1, movie2.getFrequentRenterPoints(1));
        assertEquals(2, movie2.getFrequentRenterPoints(4));
        assertEquals(1, movie3.getFrequentRenterPoints(1));
    }
}
