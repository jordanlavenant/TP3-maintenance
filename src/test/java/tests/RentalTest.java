package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.ChildrensMovie;
import app.Movie;
import app.NewReleaseMovie;
import app.RegularMovie;
import app.Rental;

class RentalTest {
    private Movie movie1;
    private Movie movie2;
    private Movie movie3;

    private Rental rental1;
    private Rental rental2;
    private Rental rental3;

    @BeforeEach
    void setUp() {
        movie1 = new RegularMovie("Regular Movie");
        movie2 = new NewReleaseMovie("NewRelease Movie");
        movie3 = new ChildrensMovie("Childrens Movie");

        rental1 = new Rental(movie1, 5);
        rental2 = new Rental(movie2, 4);
        rental3 = new Rental(movie3, 1);
    }

    @Test
    void testGetDaysRented() {
        assertEquals(5, rental1.getDaysRented());
        assertEquals(4, rental2.getDaysRented());
        assertEquals(1, rental3.getDaysRented());
    }

    @Test
    void testGetMovie() {
        assertEquals(movie1, rental1.getMovie());
        assertEquals(movie2, rental2.getMovie());
        assertEquals(movie3, rental3.getMovie());
    }

    @Test
    void testGetCharge() {
        assertEquals(movie1.getCharge(5), rental1.getCharge());
        assertEquals(movie2.getCharge(4), rental2.getCharge());
        assertEquals(movie3.getCharge(1), rental3.getCharge());
    }

    @Test
    void testGetFrequentRenterPoints() {
        assertEquals(movie1.getFrequentRenterPoints(5), rental1.getFrequentRenterPoints());
        assertEquals(movie2.getFrequentRenterPoints(4), rental2.getFrequentRenterPoints());
        assertEquals(movie3.getFrequentRenterPoints(1), rental3.getFrequentRenterPoints());
    }
}