package constructors;

public class Bank_Account {
	    private long accNumber;
	    private String accHolderName;
	    private double balance;

	    public Bank_Account(long accNumber, String accHolderName, double balance) {
	        this.accNumber = accNumber;
	        this.accHolderName = accHolderName;
	        this.balance = balance;
	    }
	    public long getAccNumber() {
	        return accNumber;
	    }
	    public String getAccHolderName() {
	        return accHolderName;
	    }
	    public double getBalance() {
	        return balance;
	    }
	    
	    public void deposit(double amount) {
	    	if(amount>0) {
	    		 balance += amount;
	    		System.out.println(amount + "RS"+ "deposited");
	    	}else {
	    		System.out.println("Invalid Amount");
	    	}
	    }
	    public void displayDetails() {
	    	System.out.println("Account Nunmber:"+ accNumber + "\n"+ "Holder Name: "+ accHolderName+ "\n" + "Balnnce:"+ balance+ "\n"+
	                           "------------------------");
	    }
}
