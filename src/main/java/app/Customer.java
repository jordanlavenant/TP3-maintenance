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
    ArrayList<Rental> rentalList = this.getRentals();

    String result = "Rental Record for " + getName() + "\n";

    for (Rental rental : rentalList) {
      result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
    }
    
    // add footer lines
    result += "Amount owed is " + String.valueOf(this.getTotalCharge()) + "\n";
    result += "You earned " + String.valueOf(this.getTotalFrequentRenterPoints()) + " frequent renter points";
    return result;
  }

  private double getTotalCharge() {
    double result = 0;
    for (Rental rental : rentals) {
      result += rental.getCharge();
    }
    return result;
  }

  private int getTotalFrequentRenterPoints() {
    int result = 0;
    for (Rental rental : rentals) {
      result += rental.getFrequentRenterPoints();
    }
    return result;
  }
}