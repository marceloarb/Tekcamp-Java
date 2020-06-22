package bank;

import java.util.ArrayList;

public class Customer {
	//Attributes
	  private String name;
	    private ArrayList<Double> transactions;
//Constructor
	    public Customer(String name, double initialAmount) {
	        this.name = name;
	        this.transactions = new ArrayList<Double>();
	        addTransaction(initialAmount);
	    }
// Getters and setters
	    //Autoboxing
	    public void addTransaction(double amount) {
	        this.transactions.add(amount);
	    }

	    public String getName() {
	        return name;
	    }

	    public ArrayList<Double> getTransactions() {
	        return transactions;
	    }
}
