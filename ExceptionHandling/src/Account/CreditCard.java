package Account;

import java.io.InvalidObjectException;

public class CreditCard extends VisaCard{


@Override
	public void withdraw(double Amount)
	{

		try {
			try {
				if(validatecardnumber("8126578"))
				{ super.withdraw(Amount);

				}
			} catch (CreditaccountException e) {
				e.printStackTrace();
			}


		} catch (InvalidObjectException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
