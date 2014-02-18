
public class BA_Test {
	public static void main (String [] args){
		SavingsAccount A1 = new SavingsAccount("Charlie");
		SavingsAccount A2 = new SavingsAccount("Sean");
		//Deposit some cash
		System.out.println("Account Details\n" + A1.toString());
		System.out.println("Account Details\n" + A2.toString());
		A1.deposit(100.5);
		A2.deposit(50.5);
		System.out.println("Account Details\n" + A1.toString());
		System.out.println("Account Details\n" + A2.toString());
		
		System.out.println("Withdraw $75 from both accounts");
		A1.withdraw(75);
		A2.withdraw(75);
		System.out.println("Account Details\n" + A1.toString());
		System.out.println("Account Details\n" + A2.toString());
		
		
		
		/*
		BaseAccount A2 = new SavingsAccount("Sean");
		
		System.out.println("A1 : " + A1.toString());
		System.out.println("A2 : " + A2.toString());
		
		System.out.printf("Account A1 is of type %s\n", A1.getClass());
		System.out.printf("Account A2 is of type %s\n", A2.getClass());
		System.out.println("So does A1 equal A2: " + (A1.equals(A2)?"True":"False"));
		
		//System.out.printf("How does A1.compareTo(A2) %d\n", A1.compareTo(A2));
		//System.out.printf("How does A2.compareTo(A1) %d\n", A2.compareTo(A1));
		
		System.out.println(A2.equals(A1)?"True":"False");
		A2 = A1;
		System.out.println("Set A2 = A1");
		System.out.println("So does A1 equal A2: " + (A1.equals(A2)?"True":"False"));
		//System.out.printf("How does A1.compareTo(A2) %d\n", A1.compareTo(A2));
		//System.out.printf("How does A2.compareTo(A1) %d\n", A2.compareTo(A1));
		 * */
		 
	}
}
