/**
 * A class representing ITC322 Assignment 1 Task 3
 * ChequeAccount. This class extends class developed in 
 * Task 1 of this assignment. 
 * 
 * @see 	ChequeAccount
 * @author 	Sean Matkovich
 * @author  11187033
 * 
 */
public class ChequeAccount extends BaseAccount {

	private double creditLimit;
	private double transactionFee = 0.3;
	
	public ChequeAccount(){
		super(0);
		setCreditLimit(0);
	}
	
	public ChequeAccount(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Setter - creditLimit value
	 * @param creditLimit - positive value that represent the credit limit of the account
	 */
	public boolean setCreditLimit(double creditLimit){
		if (creditLimit >= 0){
			this.creditLimit = creditLimit;
			return true;
		}
		return false;
		}
	
	public double getCreditLimit(){
		return creditLimit;
	}
	
	@Override
	public boolean deposit(double cash) {
		
		double totalDepositAmount = cash - transactionFee;
		
		if (totalDepositAmount >= 0){ // checks for positive value
			setBalance(totalDepositAmount);
			return true;
		}
		System.out.println("You must enter a positive value!");
		return false;
	}

	public boolean withdraw(double cash){
		
		double totalWithdrawalAmount; 
		
		// checks the cash amount passed in is a positive value
		if (cash >= 0){ 
			totalWithdrawalAmount = cash + transactionFee;
			System.out.printf("Amount including transacation fee is %s\n",totalWithdrawalAmount);
			// checks thats funds are available by adding the credit limit and the current balance
			// and comparing against the sum of the withdrawal amount and the transaction fee
			if ( getBalance() + getCreditLimit() >= (totalWithdrawalAmount) ) {
				setBalance(-totalWithdrawalAmount);
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("Name:\t\t\t%s\nAccount Number:\t\t%s\nCredit Limit:\t\t%.2f\nAccount Balance:\t%.2f", getOwner(), getId().toString(), getCreditLimit(), getBalance());
	}

}
