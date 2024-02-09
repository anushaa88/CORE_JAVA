package customexceptions;

// Custom exception for invalid withdrawal
public class InvalidWithdrawalException extends Exception {
    public InvalidWithdrawalException(String message) {
        super(message);
    }
}
