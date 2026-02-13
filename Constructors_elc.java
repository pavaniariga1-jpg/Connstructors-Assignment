package constructors;

public class BankTest {
	    	public static void main(String[] args) {
	            Bank_Account account1 = new Bank_Account(5637842, "Sweety", 50000);
	            account1.deposit(7000);
	            account1.displayDetails();
	            Bank_Account account2 = new Bank_Account(6245698, "Pavani", 45000);
	            account2.deposit(5000);      
	            account2.displayDetails();
