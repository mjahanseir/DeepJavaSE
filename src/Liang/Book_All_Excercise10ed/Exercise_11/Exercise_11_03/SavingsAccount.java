package LiangExcercise10thAll.Exercise_11.Exercise_11_03;

import LiangExcercise10thAll.Exercise_11.Exercise_11_08.Account;

/*************************************
*          SavingsAccount            *
*------------------------------------*
* +SavingsAccount()                  *
* +withdraw(amount: double): boolean *
**************************************/
// Implement SavingsAccount class
public class SavingsAccount
		extends Account {
	
	/** Construct a default CheckingAccount object */
	public SavingsAccount() {
		super();
	}

	/** Construct a SavingsAccount with specified id, balance */
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	/** Decrease balance by amount */
	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println(
				"Error! Savings account overdrawn transtaction rejected");
	}
}