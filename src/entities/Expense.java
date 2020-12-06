package entities;

public class Expense { 
	private double expense;
    private int month;
    private int year;
    private String description;
   
    
    public Expense(String description, double expense, int month, int year) {
    	this.description = description;
    	this.expense = expense;
    	this.month = month;
    	this.year = year; 	
	}

	public double getExpense() {
		return expense;
	}

	public void setExpense(double expense) {
		this.expense = expense;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
    
    

}