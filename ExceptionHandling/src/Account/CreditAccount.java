package Account;

public class CreditAccount extends Account {


	boolean Accountvalidation(String accountnumber) {
		if (accountnumber.length()>5)
		return true;

		throw new IllegalArgumentException("Invalid account number");


	}
}