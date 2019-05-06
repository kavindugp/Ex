package Account;

public class CreditaccountException extends Exception {

    public CreditaccountException() {
        super();
    }

    public CreditaccountException(String message) {
        super(message);
    }

    public CreditaccountException(String message, Throwable cause) {
        super(message, cause);
    }
}
