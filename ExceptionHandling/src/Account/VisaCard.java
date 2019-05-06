package Account;

import java.io.InterruptedIOException;
import java.io.InvalidObjectException;

public class VisaCard extends CreditAccount {

    @Override
    public void withdraw(double Amount) {
     System.out.println("withdraw made from credit account clas");
    }

    public boolean validatecardnumber(String cardnumber) throws InvalidObjectException, CreditaccountException {

        if (Accountvalidation(cardnumber)){

            if (cardnumber.startsWith("812"))
                return true;

        throw new InvalidObjectException("Invalid card number");

        }
    else
        {
        throw new CreditaccountException("Invalid Account number");
        }
}


}




