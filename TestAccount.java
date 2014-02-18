import java.util.ArrayList;
import java.util.Random;
//import java.util.SortedSet;
//import java.util.TreeSet;

public class TestAccount {
	public static void main (String[] args){
		ArrayList<BaseAccount> list = new ArrayList<BaseAccount>();
		Random r = new Random();
		
		
		try{
			list.add(new SavingsAccount());
			list.add(new ChequeAccount());
			list.add(new SavingsAccount("Sean"));
			list.add(new ChequeAccount("Charlie"));
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		for (BaseAccount b : list){
			b.setBalance(r.nextInt(50-25)+25);
			System.out.printf("%s\t%.2f\t%s\n",b.getId(),b.getBalance(),b.getOwner());
		}
		
		BaseAccount[] myArray = new BaseAccount[list.size()]; 
		myArray = list.toArray(myArray);
		
		System.out.println(myArray[1].toString());
		double amountToWithdraw = ((ChequeAccount) myArray[1]).getBalance()- 0.5;
		System.out.printf("Withdrawing %s\n", amountToWithdraw);
		((ChequeAccount) myArray[1]).withdraw(((ChequeAccount) myArray[1]).getBalance()- 0.5);
		System.out.println(myArray[1].toString());
		
	}
}
