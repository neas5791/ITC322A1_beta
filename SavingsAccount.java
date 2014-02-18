
public class SavingsAccount extends BaseAccount{

	/**
	 *  Constructor - this default constructor creates an
	 *  object initialized with "no owner" + the last 4 characters
	 *  of the unique account number as the string name 
	 *  and 0 for account balance 
	 *  
	 *  method is not available outside this ensuring class to
	 *  ensure that each object get its only. 
	 */
	public SavingsAccount(){
		// calls the BaseAccount constructor and initializes the balance
		// with zero dollars
		super(0);
	}
	/**
	 * Overloaded constructor
	 * Sets owner name and call base class constructor to set
	 * name and balance at zero.
	 * @param owner - String value of owners name
	 */
	public SavingsAccount(String owner) {
		super(owner);
	}

	/****************************************************/

	@Override
	public boolean deposit(double cash) {
		if (cash >= 0){ // checks for positive value
			modifyBalance(cash);
			return true;
		}
		System.out.println("You must enter a positive value!");
		return false;
	}

	/**
	 * Accept cash value for withdrawal
	 * Checks the amount is positive then calls superclass setBalance(-value)
	 * to set new balance value
	 * @param cash - is the positive amount that the balance will be adjusted by.
	 * @return - returns true if balance is adjusted.
	**/
	public boolean withdraw(double cash){
		// checks for positive value and the account 
		// has enough money to make the withdrawal
		if ( (cash >= 0 ) && getBalance() >= cash){ 
			modifyBalance(-cash);
			return true;
		}
		if (cash < 0)
			System.out.println("You must enter a positive value!");
		else
			System.out.println("You don't have enough money in your account!");
		return false;
	}
	
	/**
	 * Accept interest rate value
	 * Checks the rate is positive then calls superclass setBalance(getBalance() * rate)
	 * to set new balance value
	 * @param rate - is the positive amount that the balance will be adjusted by.
	 * @return - returns true if balance is adjusted.
	**/
	public boolean addInterest(double rate){
		if (rate >= 0){
			modifyBalance(getBalance()*(rate/100));
			return true;
		}
		return false;
	}

	/****************************************************/

	@Override
	public String toString() {
		return String.format("Name:\t\t\t%s\nAccount Number:\t\t%s\nAccount Balance:\t%.2f", getOwner(), getId().toString(), getBalance());
	}

}


/**
 * Overloaded constructor
 * Sets owner name and call base class constructor to set
 * name and balance at zero.
 * @param owner - String value of owners name
 *//*
public SavingsAccount(String owner, double balance) {
	super(owner,balance);
}
*/


/**
 * Compares this object with the specified object for order.  Returns a
 * negative integer, zero, or a positive integer as this object is less
 * than, equal to, or greater than the specified object.
 **
@Override
public int compareTo(BaseAccount o) {
	// uses the String compareTo method to 
	// return the relative position of the object
	return getOwner().compareTo(o.getOwner());
}*/

/**
 * Accepts cash  values for deposit
 * Checks the cash amount is positive calls the superclass setBalance(value)
 * to set new balance amount
 * @param cash - is the positive amount that the balance will be adjusted by.
 * @return - returns true if balance is adjusted. 
**/