package app;

import java.util.ArrayList;

public class Customer {
  private String name;
  private ArrayList<Rental> rentals = new ArrayList<Rental>();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }

  public ArrayList<Rental> getRentals() {
    return rentals;
  }

  public String statement() {
    double totalAmount = 0;
    int frequentRenterPoints = 0;
    ArrayList<Rental> rentalList = this.getRentals();
    String result = "Rental Record for " + getName() + "\n";

    for (Rental rental : rentalList) {
      double thisAmount = rental.getCharge();
      // add frequent renter points
      frequentRenterPoints += rental.getFrequentRenterPoints();
      // show figures for this rental
      result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
      totalAmount += thisAmount;
    }
    // add footer lines
    result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
    result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
    return result;
  }
}