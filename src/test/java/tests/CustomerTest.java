package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import app.ChildrensMovie;
import app.Customer;
import app.Movie;
import app.NewReleaseMovie;
import app.RegularMovie;
import app.Rental;

public class CustomerTest {

    @Test
    public void testStatementForRegularMovie() {
        Movie movie = new RegularMovie("The Godfather");
        Rental rental = new Rental(movie, 3);
        Customer customer = new Customer("John Doe");
        customer.addRental(rental);

        String expected = "Rental Record for John Doe\n\tThe Godfather\t3.5\nAmount owed is 3.5\nYou earned 1 frequent renter points";

        assertEquals(expected, customer.statement());
    }

    @Test
    public void testStatementForNewReleaseMovie() {
        Movie movie = new NewReleaseMovie("Avengers: Endgame");
        Rental rental = new Rental(movie, 2);
        Customer customer = new Customer("Jane Doe");
        customer.addRental(rental);

        String expected = "Rental Record for Jane Doe\n\tAvengers: Endgame\t6.0\nAmount owed is 6.0\nYou earned 2 frequent renter points";

        assertEquals(expected, customer.statement());
    }

    @Test
    public void testStatementForChildrensMovie() {
        Movie movie = new ChildrensMovie("Frozen");
        Rental rental = new Rental(movie, 4);
        Customer customer = new Customer("Alice");
        customer.addRental(rental);
        String expected = "Rental Record for Alice\n\tFrozen\t3.0\nAmount owed is 3.0\nYou earned 1 frequent renter points";
        assertEquals(expected, customer.statement());
    }

    @Test
    public void testStatementForMultipleRentals() {
        Movie movie1 = new RegularMovie("The Godfather");
        Rental rental1 = new Rental(movie1, 3);
        Movie movie2 = new NewReleaseMovie("Avengers: Endgame");
        Rental rental2 = new Rental(movie2, 2);
        Movie movie3 = new ChildrensMovie("Frozen");
        Rental rental3 = new Rental(movie3, 4);
        Customer customer = new Customer("Bob");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);
        String expected = "Rental Record for Bob\n\tThe Godfather\t3.5\n\tAvengers: Endgame\t6.0\n\tFrozen\t3.0\nAmount owed is 12.5\nYou earned 4 frequent renter points";
        assertEquals(expected, customer.statement());
    }

    @Test
    public void testStatementForRegularMovieMoreThanTwoDays() {
        Movie movie = new RegularMovie("The Godfather");
        Rental rental = new Rental(movie, 4);
        Customer customer = new Customer("John Doe");
        customer.addRental(rental);

        String expected = "Rental Record for John Doe\n\tThe Godfather\t5.0\nAmount owed is 5.0\nYou earned 1 frequent renter points";

        assertEquals(expected, customer.statement());
    }

    @Test
    public void testStatementForChildrensMovieMoreThanThreeDays() {
        Movie movie = new ChildrensMovie("Frozen");
        Rental rental = new Rental(movie, 5);
        Customer customer = new Customer("Alice");
        customer.addRental(rental);

        String expected = "Rental Record for Alice\n\tFrozen\t4.5\nAmount owed is 4.5\nYou earned 1 frequent renter points";

        assertEquals(expected, customer.statement());
    }

    @Test
    public void testStatementForNewReleaseMovieMoreThanOneDay() {
        Movie movie = new NewReleaseMovie("Avengers: Endgame");
        Rental rental = new Rental(movie, 3);
        Customer customer = new Customer("Jane Doe");
        customer.addRental(rental);

        String expected = "Rental Record for Jane Doe\n\tAvengers: Endgame\t9.0\nAmount owed is 9.0\nYou earned 2 frequent renter points";

        assertEquals(expected, customer.statement());
    }
}